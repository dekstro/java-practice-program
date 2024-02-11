package binarySearching;

public class findUpperBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int low=0,high=arr.length-1;
        int x = 40;
        int ub=arr.length; //upper bound take maximium bound
        while (low<=high) {
            int mid=(high-low)/2+low;
            if(arr[mid]>x){
                ub=Math.min(mid, ub);
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(ub);
    }
}
