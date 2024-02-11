package basicSorting;

public class selectionSort2 {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,-4,20,1,-6,8};
        print(arr);
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            int max=Integer.MIN_VALUE;
            int maxdx=-1;
            for(int j=i;j>=0;j--){
                if (arr[j]>max) {
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }
        print(arr);
    }
}
