package twentyonedaysChallenge.day4;

public class firstidxusingbinary {
    public static int binarysearchingfirstidx(int[]arr,int target){
        int low = 0, high = arr.length-1;
        int idx = - 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                 idx  = mid;
                high = mid - 1;
                 

            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return idx;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,4,4,8,9};
        System.out.println(binarysearchingfirstidx(arr, 4));
        
    }
}
