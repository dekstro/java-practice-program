package stack;

import java.util.Stack;

public class reverseRecursively {
    public static void revRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top=st.pop();
        revRec(st);
        System.out.println(top);
        //revRec(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        revRec(st);
    }
}
