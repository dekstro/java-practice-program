//1
//AB
//123
//ABCD
//12345
package pattern_printing;
public class numberLetterTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if (i%2==0){
                    System.out.print((char)(j+64));
                }
                else System.out.print(j);
            }
            System.out.println();
        }
    }
}
