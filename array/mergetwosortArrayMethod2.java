package array;

public class mergetwosortArrayMethod2 {
    public static void main(String[] args) {
        int[] a={1,6,8,22,45};
        int[] b={3,9,10,56,69};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                c[k]=a[i];
                i--;
            }
            else{
                c[k]=b[j];
                j--;
            }
            k--;
        }
        if (i>=-1) {
            while (j>=0) {
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if (j>=-1) {
            while (i>=0) {
                c[k]=a[i];
                i--;
                k--;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
