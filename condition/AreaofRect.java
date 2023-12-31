
import java.util.*;
public class AreaofRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length,breadth,area,perimeter;
        System.out.print("Enter length of Rectangle: ");
        length=sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        breadth=sc.nextInt();
        area=length*breadth;
        perimeter=2*(length+breadth);
        if (area>perimeter) {
            System.out.println("Area is greater "+area);
        }
        else{
            System.out.println("Perimeter is greater "+perimeter);
        }
        sc.close();
    }
}
