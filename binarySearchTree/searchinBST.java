package binarySearchTree;

public class searchinBST {
    public static boolean searchBST(TreeNode root, int x){
        if(root==null) return false;
        if(root.val>x) return searchBST(root.left,x);
        else if(root.val<x) return searchBST(root.right,x);
        else return true;
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
        System.out.println(searchBST(root, 9));
    }
}
