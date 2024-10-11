import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        // Searching for target '11'
        System.out.println(Arrays.toString(searchSortedMatrix(arr, 11)));
    }

    // Function to search in a sorted 2D matrix
    private static int[] searchSortedMatrix(int[][] arr, int target) {
        // Get the number of rows and columns in the matrix
        int row = arr.length;
        int column = arr[0].length;

        // Case 1: If there's only one row, do a binary search on that row
        if (row == 1) {
            return binarySearch(arr, 0, 0, column - 1, target);
        }

        // Variables to track the starting and ending rows during the search
        int rStart = 0;
        int rEnd = row - 1;

        // cMid is the middle column index, which will be our point of comparison
        int cMid = column / 2;

        // Binary search over rows: reduce the range of rows until only two remain
        while (rStart < rEnd - 1) { // This condition ensures we have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2; // Calculate the mid-row

            // Compare the target with the middle element of the mid-row in the middle column
            if (arr[mid][cMid] == target) {
                // If the target is found, return its coordinates
                return new int[]{mid, cMid};
            } else if (arr[mid][cMid] < target) {
                // If target is greater, search in the lower half (move rStart down)
                rStart = mid;
            } else {
                // If target is smaller, search in the upper half (move rEnd up)
                rEnd = mid;
            }
        }

        // After the loop, we have only two rows left: rStart and rEnd
        // We now check the middle column of both rows
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid}; // Check if the target is in the middle of rStart
        }
        if (arr[rEnd][cMid] == target) {
            return new int[]{rEnd, cMid}; // Check if the target is in the middle of rEnd
        }

        // If the target wasn't in the middle column, we now search the 4 quadrants around cMid

        // Search in the left half of rStart (first half)
        int[] result = binarySearch(arr, rStart, 0, cMid - 1, target);
        if (result[0] != -1) return result; // If found, return the result

        // Search in the right half of rStart (second half)
        result = binarySearch(arr, rStart, cMid + 1, column - 1, target);
        if (result[0] != -1) return result; // If found, return the result

        // Search in the left half of rEnd (first half)
        result = binarySearch(arr, rEnd, 0, cMid - 1, target);
        if (result[0] != -1) return result; // If found, return the result

        // Search in the right half of rEnd (second half)
        return binarySearch(arr, rEnd, cMid + 1, column - 1, target);
    }

    // Helper function to perform binary search on a single row
    // This searches within a specified range of columns in the given row
    private static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            // Calculate the middle column in the current search range
            int mid = cStart + (cEnd - cStart) / 2;

            // If the target is found, return its position
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (arr[row][mid] < target) {
                // If target is greater, narrow the search to the right half
                cStart = mid + 1;
            } else {
                // If target is smaller, narrow the search to the left half
                cEnd = mid - 1;
            }
        }
        // Return [-1, -1] if the target is not found
        return new int[]{-1, -1};
    }
}
 