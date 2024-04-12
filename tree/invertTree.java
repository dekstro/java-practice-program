package tree;

public class invertTree {
    public static TreeNode invert(TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
        return root;
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
        System.out.println(invert(root));
    }
}
