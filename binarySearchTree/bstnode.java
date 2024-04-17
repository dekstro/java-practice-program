package binarySearchTree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class bstnode {
    private static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(6);
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(7);
        root.left=a; root.right=b;
        a.left=c; a.right=d;
        b.left=e; b.right=f;
        display(root);
    }
}
