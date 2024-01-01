package loops;
import java.util.*;
public class composite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        
        
        for(int i=2;i<=n-1;i++){ // i=2;i<=n-1 bcz we will check number composite other than 1 and given no n as both are compostite we will not take na
            if(n%i==0){
                System.out.println("It is composite");
                break;
            } 
            else System.out.println("Not composite");
            
        }
        sc.close();
    }
}
