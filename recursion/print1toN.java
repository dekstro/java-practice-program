package recursion;

import java.util.Scanner;

public class print1toN {
    public static void print(int n, int a){
        if(a==n+1) return;
        System.out.println(a);
        print(n, a+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int a=1;
        print(n, a);
        sc.close();
    }
}
