package recursion;

public class arrayTraversal {
    public static void print(int i,int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1, arr);
    }
    public static void main(String[] args) {
        int[] arr={45,96,4,9,8,10,15};
        print(0,arr);
    }
}
