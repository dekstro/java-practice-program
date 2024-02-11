package basicSorting;

public class insertionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,4,2,3,1};
        print(arr);
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if (arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
        print(arr);
    }
}
