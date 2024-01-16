package array;

public class sort0and1and2 {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0};
        int n=arr.length;
        int zero=0,one=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            if(arr[i]==1) one++;
        }
        for(int i=0;i<n;i++){
            if(i<zero) arr[i]=0;
            else if(i<zero+one) arr[i]=1;
            else arr[i]=2;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
