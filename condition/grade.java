
import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage 0 to 100%: ");
        int percentage=sc.nextInt();
        if (percentage>=81 && percentage<=100) {
            System.out.println("Very Good");
        }
        else if (percentage>=61 && percentage<=80) {
            System.out.println("Good");
        }
        else if (percentage>=41 && percentage<=60) {
            System.out.println("Average");
        }
        else System.out.println("Fail");
        sc.close();
    }
}
