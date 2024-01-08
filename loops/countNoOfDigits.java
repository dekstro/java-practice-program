package loops;
import java.util.*;
public class countNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        while(n!=0){ // for ex n=26 26!=0 true | 2!=0
            n=n/10; // 26/10=2                 | 2/10=0
            count++; // 1                      | 2 output 2
        }
        System.out.println(count);
        sc.close();
    }
}
