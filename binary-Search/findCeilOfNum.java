public class findCeilOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 8, 10, 14, 18, 22};
        int key = 17;
        int ceil = findCeil(arr, key);
        if (ceil == -1) {
            System.out.println("Ceil not found");
        } else {
            System.out.println("Ceil is: " + ceil);
        }
    }

    static int findCeil(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[low];
    }
}
