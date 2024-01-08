package pattern_printing;

public class rhombus {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){  //inverse triangle
                System.out.print(" ");
            }
            for (int j=1;j<=4;j++){  // star square
                System.out.print("*"); // mix both
            }
            System.out.println();
        }
    }
}
