package recursion;

import java.util.ArrayList;

public class s {
    static ArrayList<String> str=new ArrayList<>();
    public static void print(int i, int k, String s, String ans){
        if (i==s.length() || i==k) {
            str.add(ans);
            return;
        }
        char ch=s.charAt(i);
        print(i+1,k, s, ans); 
        print(i+1,k, s, ans+ch);

    }
    public static void main(String[] args) {
        String s="1234";
        int k=2;
        str=new ArrayList<>();
        print(0,k,s,"");
        System.out.println(str);
    }
}
