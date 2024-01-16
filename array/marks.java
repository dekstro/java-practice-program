package array;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int[] arr=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();  
        }
        for (int i=0;i<5;i++){
            if (arr[i]<35) {
                System.out.print(i);
            }
        }
        sc.close();
    }
}
