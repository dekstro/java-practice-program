package hashmaps;

import java.util.HashMap;

public class iterarateMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Abhi");
        map.put(2, "Ram");
        map.put(3,"Sushri");
        map.put(4, "Ritika");
        map.put(5, "Raghav");
        for(int key: map.keySet()){
            String val=map.get(key);
            System.out.println(key+" "+val);
        }
    }
}
