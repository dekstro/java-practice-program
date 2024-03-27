package stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Stack <Integer> st_reverse=new Stack<>();
        while (!st.isEmpty()) {
            st_reverse.push(st.pop());
        }
        System.out.println(st_reverse);
    }
}
