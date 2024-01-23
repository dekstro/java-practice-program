package twoD_Array;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int[][] c=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
