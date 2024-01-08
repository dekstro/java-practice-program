package loops;
import java.util.*;
public class s2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=4,y=0;
        while (x>=0) {
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }
        sc.close();
    }
}
