package loops;
import java.util.*;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,ld;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        while(n!=0){  // ex 26 26!=0  | 2!=0     
            ld=n%10; // 26%10=6       | 2%10=2
            n=n/10;  // 26/10=2       | 2/10=0
            sum=sum+ld;   // 0+6=6     | 6+2=8 output 8
        }
        System.out.println(sum);
        sc.close();
    }
}
