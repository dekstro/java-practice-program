package tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
    private static void level(TreeNode root){
        Queue<TreeNode> q= new LinkedList<>();
        if(root!=null) q.add(root);
        while (q.size()>0) {
            TreeNode front= q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
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
        level(root);
    }
}
