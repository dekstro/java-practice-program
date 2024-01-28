package strings;


import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two string: ");
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()) System.out.println("not anagram");
        else{
            char[] x=a.toCharArray();
        Arrays.sort(x);
        char[] y=b.toCharArray();
        Arrays.sort(y);
        boolean flag=true;
        for(int i=0;i<a.length();i++){
            if(x[i]!=y[i]){
                flag=false;
            }
        }
        if(flag==false) System.out.println("Not Anagram");
        else System.out.println("Anagram");
        }
        
        sc.close();
    }
}
