package loops;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        
        int prime=0;
        for(int i=2;i<=n-1;i++){ // i=2;i<=n-1 bcz we will check number composite other than 1 and given no n as both are compostite we will not take na
            if(n%i==0){
                System.out.println("Composite");
                prime=1; // here if the no is composite it not prime so we can assign any no to prime so that it is not ==0
                break;  
            }  
        }
        if (n==1){
            System.out.println("Neither prime nor composite"); // 1 is not prime 
        }
        if(prime==0){
            System.out.println("Prime");
        }
        sc.close();
    }
}
