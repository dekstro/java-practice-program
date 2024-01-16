package array;

public class mergeTwoSortArray {
    public static void main(String[] args) {
        int[] a={1,6,8,22,45};
        int[] b={3,9,10,56,69};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if (a[i]<=b[j]) {
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if (i==m) {
            while (j<n) {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if (j==n) {
            while (i<m) {
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
