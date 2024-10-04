public class numberofRotations {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        int rotationNumber = findArrayPivot(arr);
        System.out.println(rotationNumber + 1);
    }

    static int findArrayPivot(int[] arr) {
        if (arr == null || arr.length == 0) return -1; // Handle empty array

        int left = 0;
        int right = arr.length - 1;

        // If array is already sorted, return 0 (no rotations)
        if (arr[left] <= arr[right]) return 0;

        while (right >= left) {
            int mid = left + (right - left) / 2;

            // Handle pivot at the last element
            if (mid < right && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Handle pivot at the first element
            if (mid > left && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Move search boundaries
            if (arr[mid] >= arr[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
