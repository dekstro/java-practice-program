package binarySearching;

public class findSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int t=6;
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx, arr[i]);
        }
        int low=1, high=mx;
        int d=0;
        while (low<=high) {
            int mid=(high-low)/2+low;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0) sum=sum+(arr[i]/mid);
                else sum=sum+(arr[i]/mid+1);
            }
            if (sum<=t) {
                d=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(d);
    }
}
