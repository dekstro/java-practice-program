package stack;

import java.util.Stack;

public class insertAtParticularIndex {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int idx=3;
        int ele=100;
        System.out.println(st);
        Stack <Integer> temp=new Stack<>();
        while (st.size()>=idx) {
            temp.push(st.pop());
        }
        st.push(ele);
        while (temp.size()>0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
