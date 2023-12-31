
import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter age of Ram ");
        a=sc.nextInt();
        System.out.print("Enter age of Shyam ");
        b=sc.nextInt();
        System.out.print("Enter age of Ajay ");
        c=sc.nextInt();
        if (a<b){      // Ram < shyam
            if (a<c) {  // ram < ajay
                System.out.println("Ram is youngest");  // ram
            }
            else System.out.println("Ajay is youngest");  // ajay
        }
        else{  
            if (b<c) {
                System.out.println("Shyam is youngest");
            }
            else System.out.println("Ajay is youngest");
        }
        sc.close();
    }
}
