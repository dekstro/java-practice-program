package tree;

public class productOfNodes {
    private static int product(TreeNode root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
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
        System.out.println(product(root));
    }
}
