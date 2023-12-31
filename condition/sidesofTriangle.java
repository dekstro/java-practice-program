
import java.util.*;
public class sidesofTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a ");
        a=sc.nextInt();
        System.out.print("Enter b ");
        b=sc.nextInt();
        System.out.print("Enter c ");
        c=sc.nextInt();
        if (((a+b)>c) && ((b+c)>a) && ((c+a)>b)) {
            System.out.println("Can be side of triangle");
        }
        else System.out.println("Can't be side of triangle");
        sc.close();
    }
}
