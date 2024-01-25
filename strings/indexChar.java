package strings;

public class indexChar {
    public static void main(String[] args) {
        String str="I am a Software Engineer";
        char c='a';
        System.out.println(indexOf(str, c));
    }
    static int indexOf(String str,char c){
        int n=str.length();
        int index=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(c==ch) index=i;
        }
        return index;
    }
}
