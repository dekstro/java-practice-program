package binarySearching;

public class simpleBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,12,16,45,58,69,88,90};
        int low=0,high=arr.length-1;
        int target = 58;
        int idx=-1;
        boolean flag=false;
        while (low<=high) {
            int mid=(high-low)/2+low;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]==target){
                idx=mid;
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.println("Target found at index "+idx);
        else System.out.println("Target not found");
    }
}
