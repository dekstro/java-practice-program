package recursion;

import java.util.ArrayList;

public class printSubsetString {
    static ArrayList<String> str=new ArrayList<>();
    public static void print(int i, String s, String ans){
        if (i==s.length()) {
            str.add(ans);
            return;
        }
        char ch=s.charAt(i);
        print(i+1, s, ans); //not take
        print(i+1, s, ans+ch);  //take
    }
    public static void main(String[] args) {
        String s="abcd";
        str=new ArrayList<>();
        print(0,s,"");
        System.out.println(str);
    }
}
