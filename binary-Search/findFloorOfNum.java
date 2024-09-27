public class findFloorOfNum {
    public static void main(String[] args) {
        int [] arr = {1,12,34,54,67,87,98,99,100};
        int key = 69;
        int floor = PerformBinarySearch(arr,key);
        System.out.println("The floor of the num is "+ floor);
    }
    private static int PerformBinarySearch(int [] arr, int key ){
        int low = 0;
        int high = arr.length-1;
        while(low<= high){
            int mid = low +(high-low)/2;
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]>key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return arr[high];
    }
}