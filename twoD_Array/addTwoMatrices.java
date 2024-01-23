package twoD_Array;

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{4,5,6},{1,2,3}};
        int m=a.length;
        int n=a[0].length;
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int[] ele: res){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
