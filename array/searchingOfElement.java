package array;

import java.util.Scanner;

public class searchingOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        System.out.print("Enter element to find: ");
        int x=sc.nextInt();
        System.out.println("Enter no: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.print("Element found");
        else System.out.println("Element not found");
        sc.close();
    }
}
