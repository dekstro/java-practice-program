package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class postOrderTraversalIterative {
    public static List<Integer> postOrder(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root!=null) st.push(root);
        while (st.size()>0) {
            TreeNode top=st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right); 
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        TreeNode c=new TreeNode(4);
        TreeNode d=new TreeNode(5);
        TreeNode e=new TreeNode(6);
        root.left=a; root.right=b;
        a.left=c; a.right=d;
        b.right=e;
        System.out.println(postOrder(root));
    }
}
