package binarySearching;

import java.util.Scanner;

public class findSqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int x=sc.nextInt();
        int low=0, high=x;
        int idx=0;
        while (low<=high) {
            int mid=(high-low)/2+low;
            if (mid*mid==x) {
                idx=mid;
                break;
            }
            else if(mid*mid>x) high=mid-1;
            else if(mid*mid<x) low=mid+1;
            idx=high;
        }
        System.out.println(idx);
        sc.close();
    }
}
