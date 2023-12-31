
import java.util.*;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter x: ");
        x=sc.nextInt();
        System.out.print("Enter y: ");
        y=sc.nextInt();
        if (x==0 && y==0) {
            System.out.println("Origin");
        }
        else if (x>0 && y>0) {
            System.out.println("1st Quadrant");
        }
        else if (x<0 && y>0) {
            System.out.println("2nd Quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println("3rd Quadrant");
        }
        else System.out.println("4th Quadrant");
        sc.close();
    }
}
