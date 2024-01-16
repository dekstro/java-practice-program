package array;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50}; //30 40 50 10 20 
        int k=3;
        rotate(arr, k);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] arr,int i,int j){
        while (i<=j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
    }
}
