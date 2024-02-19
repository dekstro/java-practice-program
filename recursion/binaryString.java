package recursion;

import java.util.Scanner;

public class binaryString {
    public static void binary(String ans, int a){
        int n=ans.length();
        if(n==a){
            System.out.println(ans);
            return;
        }
        if (n==0 || ans.charAt(n-1)=='0') {
            binary(ans+'0', a);
            binary(ans+'1', a);
        }
        else binary(ans+'0', a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a=sc.nextInt();
        binary("",a);
        sc.close();
    }
}
