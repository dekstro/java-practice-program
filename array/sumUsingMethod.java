package array;

import java.util.Scanner;

public class sumUsingMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int[] arr={1,2,6,4};
        sumUsingMethod ob=new sumUsingMethod();
        ob.summ(arr);
        sc.close();
    }
    void summ(int[] x){
        int sum=0;
        for(int i=0;i<=3;i++){
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}
