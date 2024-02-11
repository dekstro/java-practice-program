package binarySearching;

public class findFirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,20,20,30,30,40};
        int[] ans={-1,-1}; // initial value of final ans array
        int x=20;
        int low=0,high=arr.length-1;

         // checking whether the element is present or not
        boolean flag=false;
        while (low<=high) {
            int mid=(high-low)/2+low;
            if (arr[mid]==x) {
                flag=true;
                break;
            }
            if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        // if not present print -1 -1
        if(flag==false){
            for(int ele: ans){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        // if present print first occurence i.e., lowerbound and last occurence i.e., upper bound-1
        else{
            low=0;high=arr.length-1;
            int lb=arr.length; //lower bound take maximium bound
            while (low<=high) {
                int mid=(high-low)/2+low;
                if(arr[mid]>=x){
                    lb=Math.min(mid, lb);
                    high=mid-1;
                }
                else low=mid+1;
            }
            ans[0]=lb;

            low=0;high=arr.length-1;
            int ub=arr.length; //upper bound take maximium bound
            while (low<=high) {
                int mid=(high-low)/2+low;
                if(arr[mid]>x){
                    ub=Math.min(mid, ub);
                    high=mid-1;
                }
                else low=mid+1;
            }
            ans[1]=ub-1;

            for(int ele: ans){
                System.out.print(ele+" ");
            }
            System.out.println();
        }  
    }
}
