package recursion;

import java.util.Scanner;

public class mazePath {
    public static int maze(int m, int n){
        if(m==1 || n==1) return 1;
        int right= maze(m, n-1);
        int down= maze(m-1, n);
        return right+down;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(maze(m,n));
        sc.close();
    }
}
