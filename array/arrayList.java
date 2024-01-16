package array;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        arr.set(2, 100);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
    }
}
