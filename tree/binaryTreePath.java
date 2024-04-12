package tree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePath {
    public static void path(TreeNode root, String s, List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s=s+root.val;
            ans.add(s);
            return;
        }
        path(root.left,s+root.val+"->",ans);
        path(root.right,s+root.val+"->",ans);
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        path(root,"",ans);
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
        System.out.println(binaryTreePaths(root));
    }
}
