package hashmaps;

import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set+" "+set.size());
        System.out.println(set.contains(50));
        System.out.println(set.contains(6));
        set.remove(50);
        System.out.println(set+" "+set.size());
    }
}
