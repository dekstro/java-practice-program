package binarySearching;

public class capacityToShipPackagesInDdays {
    public static void main(String[] args) {
        int[] arr={3,2,2,4,1,4};
        int days=3;
        int n=arr.length;
        int sum=0, mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            mx=Math.max(mx, arr[i]);
        }
        int low=mx, high=sum, c=sum;
        while (low<=high) {
            int mid=(high-low)/2+low;
            int load=0,D=1;
            for(int i=0;i<n;i++){;
                if(load+arr[i]<=mid){
                    load=load+arr[i];
                }
                else{
                    load=arr[i];
                    D++;
                }
            }
            if (D<=days) {
                c=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(c);
    }
}
