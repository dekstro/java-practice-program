package strings;

public class countVowels {
    public static void main(String[] args) {
        String str="I am a Software Engineer";
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (isVowel(ch)==true) {
                count=count+1;
            }
        }
        System.out.println(count);
    }

    static boolean isVowel(char ch){
        boolean flag=false;
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') flag=true;
        else flag=false;
        return flag;
    }    
}
    
