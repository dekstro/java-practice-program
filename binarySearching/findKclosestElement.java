package binarySearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class findKclosestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        List<Integer> ans=new ArrayList<>();
        int x=8;
        int k=3;
        int n=arr.length;
        int lb=n;
        int low=0, high=n-1;
        if (x<arr[0]) {
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            System.out.println(ans);
        }
        if (x>arr[n-1]) {
            for(int i=n-1;i>=n-k;i--){
                ans.add(arr[i]);
            }
            System.out.println(ans);
        }
        while (low<=high) {
            int mid=(high-low)/2+low;
            if (arr[mid]>=x) {
               lb=mid;
               high=mid-1; 
            }
            else low=mid+1;
        }
        int i=arr[lb-1], j=arr[lb+1];
        System.out.println(i+" "+arr[lb]+" "+j);

    }
}
