public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {90, 87, 73, 34, 14, 4, 0};
        int index = findItem(arr, 0);
        if (index == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at position " + (index + 1));
        }
    }

    static int findItem(int[] arr, int item) {
        boolean isAscending = arr[0] < arr[arr.length - 1];
        return BinarySearch(arr, 0, arr.length - 1, item, isAscending);
    }

    static int BinarySearch(int[] arr, int low, int high, int item, boolean isAscending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] < item) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[mid] > item) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
