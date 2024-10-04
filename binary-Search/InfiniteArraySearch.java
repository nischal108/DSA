public class InfiniteArraySearch {
    public static void main(String [] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10,14,25,46,67,78,98,99,100};
        System.out.println(findRange( array, 46));


}
private static int findRange(int []arr,int key){
    int start = 0;
    int end =1;
    while(key>arr[end]){
        start= end;
        end *=2;
    }
   return BinarySearch(start, end, arr, key) ;
}
    private static int BinarySearch(int start, int end , int[] arr, int key){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}