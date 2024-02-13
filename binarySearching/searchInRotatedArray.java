package binarySearching;

public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        int target =5;
        int low=0, high=arr.length-1;
        while (low<=high) {
            int mid=(high-low)/2+low;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if (arr[low]<=arr[mid]) {
                if(arr[low]<=target && target<=arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(arr[mid]<=target && target<=arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
    }
}
