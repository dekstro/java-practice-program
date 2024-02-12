package binarySearching;

public class findPeakIndex {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,30,20,10};
        int low=1, high=arr.length-2;
        int idx=0;
        while (low<=high) {
            int mid=(high-low)/2+low;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                idx=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low=mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) high=mid-1;
        }
        System.out.println(idx);
    }
}
