package strings;

import java.util.Scanner;

public class isomorphicString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two string: ");
        String s=sc.nextLine();
        String t=sc.nextLine();
        char[] arr=new char[128];
        char[] brr=new char[128];
        boolean flag=true;
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                char dh=t.charAt(i);
                int idx=(int)ch;
                if(arr[idx]=='\0'){
                    arr[idx]=dh;
                }
                else{
                    if(arr[idx]!=dh) flag=false;
                }
            }
            for(int i=0;i<s.length();i++){
                char ch=t.charAt(i);
                char dh=s.charAt(i);
                int idx=(int)ch;
                if(brr[idx]=='\0'){
                    brr[idx]=dh;
                }
                else{
                    if(brr[idx]!=dh) flag=false;
                }
            }
        }
        if(flag==true) System.out.println("Isomorphic");
        else System.out.println("Not Ismorphic");
        sc.close();
    }
}
