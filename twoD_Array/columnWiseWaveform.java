package twoD_Array;

public class columnWiseWaveform {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=arr.length;
        int n=arr[0].length;
        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=m-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
