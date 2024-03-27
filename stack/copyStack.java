package stack;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Stack <Integer> temp=new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        System.out.println(temp);
        Stack <Integer> new_stack=new Stack<>();
        while (!temp.isEmpty()) {
            new_stack.push(temp.pop());
        }
        System.out.println(new_stack);
    }
}
