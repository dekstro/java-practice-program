package loops;
import java.util.*;
public class ap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        // question 1 4 7 10 13 16 ...... nth  formula a+(n-1)d : a=1,d=3 by solving 3n-2
        for(int i=1;i<=(3*n-2);i+=3){
            System.out.println(i);
        }
        sc.close();
    }
}
