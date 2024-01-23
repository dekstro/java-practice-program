package twoD_Array;

public class searchinElement {
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=6;
        int m=arr.length;
        int n=arr[0].length;
        int i=0,j=n-1;
        while (i<m && j>=0) {
            if(arr[i][j]==target){
                System.out.println("Target Found "+i+" "+j);
                break;
            }
            else if(arr[i][j]>target) j--;
            else if(arr[i][j]<target) i++;
            else System.out.println("Target not found");  
        }
        
    }
}
