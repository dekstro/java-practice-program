package array;

public class shallowCopy {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.print("Original Array\t");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] num=arr; // copy of array arr(Shallow Copy)
        System.out.print("Copy array\t");
        for(int ele:num){
            System.out.print(ele+" ");
        }
        System.out.println();
        num[0]=50;
        System.out.println(arr[0]);
    }
}
