package recursion;

import java.util.Scanner;

public class stairCase {
     public static int stair(int n){
        if(n<=2 && n!=0) return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}
