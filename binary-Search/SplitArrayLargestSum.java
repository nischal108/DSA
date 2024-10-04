//question no :410 leetcode 
//https://leetcode.com/problems/split-array-largest-sum/


//approach
// the approach is that the largest value of k i will received will be nums.length when i will have to split the array in n parts do the largest sum will be the largest value in the array.
// the least value of k that i will receive is one when the whole array sum will be the largest sum value .....

//so basically the range of sum will be the sum when k is length and sum when k is 1,

//now here lets run a binary search which will like check the arrays and partion them such that their sum should be less than or equal to mid value and last check how many partions did we make such that the mid value was always greater 

// now if the partiona value we made is less than k  means that the sum expected is much less

//if the partions value we made is more than the k that means the k expects us to keep the sum much more 
// do this until the value of k and no of our pation matches 

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int split = 2;
        int sum = splitArray(arr, split);
        System.out.println(sum);
    }

    private static int splitArray(int[] arr, int k) {
        int lowBoundMaxSum = findLargest(arr); // Largest element in the array
        int upperBoundMaxSum = findMaxSum(arr); // Total sum of the array
        int ansSum = -1;

        while (lowBoundMaxSum <= upperBoundMaxSum) {
            int mid = lowBoundMaxSum + (upperBoundMaxSum - lowBoundMaxSum) / 2;
            int counter = 1; // Start with one partition
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    // Start a new partition if sum exceeds mid
                    counter++;
                    sum = arr[i]; // Reset the sum for the new partition
                } else {
                    sum += arr[i]; // Continue adding to current partition
                }
            }

            // Adjust binary search bounds based on the number of partitions
            if (counter <= k) {
                ansSum = mid; // Valid partitioning found, try for smaller sum
                upperBoundMaxSum = mid - 1;
            } else {
                lowBoundMaxSum = mid + 1; // Too many partitions, increase mid
            }
        }

        return ansSum;
    }

    // Function to find the largest element in the array
    private static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to find the total sum of the array
    private static int findMaxSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

    