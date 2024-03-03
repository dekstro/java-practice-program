package binarySearching;

public class minMaxProductDistribution {
    public static boolean isPossible(int maxQ, int n, int[] arr){
        int stores=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxQ==0) stores+=arr[i]/maxQ;
            else stores+=arr[i]/maxQ+1;
        }
        if(stores>n) return !true;
        return true;
    }
    public static void main(String[] args) {
        int[] arr={15,10,10};
        int n=7;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int low=1, high=max;
        int ans=0;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(isPossible(mid, n, arr)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(ans);
    }
}
