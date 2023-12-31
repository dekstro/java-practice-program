package loops;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int t=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(t+" * "+i+" = "+(t*i));
        }
        sc.close();
    }
}
