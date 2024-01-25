package strings;

import java.util.Scanner;

public class counDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numnber: ");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        String str=""+n;
        System.out.println(s);
        System.out.println(str.length());
        sc.close();
    }
}
