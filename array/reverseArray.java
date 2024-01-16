package array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={14,15,40,12,8};
        int n=arr.length;
        int i=0,j=n-1;//index of array first and last index
        while(i<=j){  
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++; //going to second index
            j--; // going to second last index
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
