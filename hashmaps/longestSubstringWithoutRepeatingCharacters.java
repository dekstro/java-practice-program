package hashmaps;

import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1) return n;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        while (j<n) {
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len=j-i;
                maxLen=Math.max(maxLen, len);
                while(s.charAt(i)!=ch) i++;
                i++;
            }
            map.put(ch, j);
            j++;
        }
        int len=j-i;
        maxLen=Math.max(maxLen, len);
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
