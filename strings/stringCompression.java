package strings;

public class stringCompression {
    public static void main(String[] args) {
        String s="aaabbcdddee";
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(i);
            char dh=s.charAt(j);
            if(ch==dh) j++;
            else{
                ans=ans+ch;
                int len=j-i;
                if(len!=1) ans=ans+len;
                i=j;
            }
        }
        ans=ans+s.charAt(i);
        int len=j-i;
        if(len!=1) ans=ans+len;
        System.out.println(ans);
    }
}
