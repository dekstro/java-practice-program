package recursion;

import java.util.Scanner;

public class sumFrom1toN {
    public static void add(int n, int sum){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        add(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        add(n,sum);
        sc.close();
    }
}
