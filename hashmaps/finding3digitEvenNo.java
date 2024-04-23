package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class finding3digitEvenNo {
    public static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int ele: digits){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        for(int i=100;i<=999;i+=2){
            int x=i;
            int c=x%10; x=x/10;
            int b=x%10; x=x/10;
            int a=x;
            if (map.containsKey(a)) {
                int aFreq=map.get(a);
                map.put(a, aFreq-1);
                if(aFreq==1) map.remove(a);
                if (map.containsKey(b)) {
                    int bFreq=map.get(b);
                    map.put(b, bFreq-1);
                    if(bFreq==1) map.remove(b);
                    if (map.containsKey(c)) {
                        ans.add(i);
                    }
                    map.put(b, bFreq);
                }
                map.put(a, aFreq);
            }
        }
        int[] ans2=new int[ans.size()];
        for(int i=0;i<ans2.length;i++){
            ans2[i]=ans.get(i);
        }
        return ans2;
    }
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        System.out.println(findEvenNumbers(digits));
    }
}
