package pattern_printing;

public class oddNoTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            int a=1;
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a=a+2;
            }
            System.out.println();
        }
    }
}
