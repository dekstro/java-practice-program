
import java.util.*;
public class greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st no ");
        a=sc.nextInt();
        System.out.print("Enter 2nd no ");
        b=sc.nextInt();
        System.out.print("Enter 3rd no ");
        c=sc.nextInt();
        if (a>=b && a>=c){
            System.out.println(a+" is greatest");
        }
        else if (b>=a && b>=c) {
            System.out.println(b+" is greatest");
        }
        else if (c>=a && c>=b) {
            System.out.println(c+" is greatest");
        }
        else System.out.println("Invalid");
        sc.close();
    }
}
