package array;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={5,8,6,4,1};
        int x=9;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]+arr[j]==x) System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
