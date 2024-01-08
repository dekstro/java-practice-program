//ABCD
//ABCD
//ABCD
//ABCD
package pattern_printing;

public class letterSqaure {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=65;j<=68;j++){ // 65='A'in Unicode
                System.out.print((char)j+" ");  // typecast int to char type
            }
            System.out.println();
        }
    }
}
