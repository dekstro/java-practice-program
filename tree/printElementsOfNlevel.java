package tree;

public class printElementsOfNlevel {
    public static void level(TreeNode root,int n,int level){
        if(root==null) return;
        if(n==level) System.out.print(root.val+" ");
        level(root.left, n, level+1);
        level(root.right, n, level+1);
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
        level(root, 2, 0);
    }
}
