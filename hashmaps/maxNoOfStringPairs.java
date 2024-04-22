package hashmaps;

import java.util.HashSet;


public class maxNoOfStringPairs {
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String rev=reverse(words[i]);
            if(set.contains(rev)) count++;
            else set.add(words[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        String[] arr={"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(arr));
    }
}
