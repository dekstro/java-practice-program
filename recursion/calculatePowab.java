package recursion;

import java.util.Scanner;

public class calculatePowab {
    public static int pow(int a, int b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(pow(a,b));
        sc.close();
    }
}
