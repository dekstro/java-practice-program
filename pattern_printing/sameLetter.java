//AAAA
//BBBB
//CCCC
//DDDD
package pattern_printing;

public class sameLetter {
    public static void main(String[] args) {
        for (int i=65;i<=68;i++){
            for (int j=1;j<=4;j++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}
