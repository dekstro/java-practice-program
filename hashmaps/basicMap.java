package hashmaps;

import java.util.HashMap;

public class basicMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Abhi");
        map.put(2, "Ram");
        map.put(3,"Sushri");
        map.put(4, "Ritika");
        map.put(5, "Raghav");
        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey(3));
        map.remove(3);
        System.out.println(map+" "+map.size());
    }
}
