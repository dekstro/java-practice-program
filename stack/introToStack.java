package stack;

import java.util.Stack;

public class introToStack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st);
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
