package strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder s=new StringBuilder(sc.nextLine());
        int n=s.length();
        int i=0,j=n-1;
        while (i<=j) {
            char ch=s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, ch);
            i++;
            j--;
        }
        System.out.println(s);
        sc.close();
    }
}
