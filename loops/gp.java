package loops;
import java.util.*;
public class gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        // question 1 2 4 8 16 32 64 ...... nth 
        // here starting no a=1,differnce is double of no a*2
        int a=1;
        for(int i=1;i<=n;i++){
            System.out.println(a); // starting from 1
            a*=2; // 1 1*2=2 2*2=4 4*2=8 8*2=16
        }
        sc.close();
    }
}
