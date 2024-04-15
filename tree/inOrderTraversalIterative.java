package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inOrderTraversalIterative {
    public static List<Integer> inOrder(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode temp=root;
        while (true) {
            if (temp!=null) {
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.size()==0) break;
                TreeNode top=st.pop();
                ans.add(top.val);
                temp=top.right;
            }
        }
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
        System.out.println(inOrder(root));
    }
}
