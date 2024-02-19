package recursion;

import java.util.Scanner;

public class generateParentheses {
    public static void parentheses(int open, int close, String s, int a){
        if (s.length()==2*a) {
            System.out.println(s);
            return;
        }
        if(open<a) parentheses(open+1, close, s+"(", a);
        if(close<open) parentheses(open, close+1, s+")", a);
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a=sc.nextInt();
        parentheses(0,0,"",a);
        sc.close();
    }
   
}
