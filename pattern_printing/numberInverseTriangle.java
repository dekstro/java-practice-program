package pattern_printing;

public class numberInverseTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=(5-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
