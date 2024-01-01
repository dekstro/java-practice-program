package loops;
import java.util.*;
public class ap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        // question 1 4 7 10 13 16 ...... nth 
        // here starting no a=1,differnce d=3 
        int a=1,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a); // starting from 1
            a+=d; // ex 1 1+3=4 4+3=7 7+3=10
        }
        sc.close();
    }
}
