package array;

public class sort0and1 {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,1,0,0,1};
        int zero=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
        }
        for(int i=0;i<n;i++){
            if(i<zero) arr[i]=0;
            else arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
