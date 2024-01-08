package pattern_printing;

public class numberFlipTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){  // for inverse triangle
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){ // for triangle
                System.out.print(j);  // mix both of them to form a flip triangle
            }
            System.out.println();
        }
    }
}
