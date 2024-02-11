package basicSorting;

public class bubbleSortDecreasingOrder {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        print(arr);
        int n=arr.length;
        for(int x=0;x<n-1;x++){
            boolean flag=false;
            for(int i=0;i<n-1-x;i++){
                if (arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=true;
                }
            }
            if(flag==false) break;
        }
        print(arr);
    }
}
