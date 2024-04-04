package tree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class nodeOfTree {
    private static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int summ(TreeNode root){
        if(root==null) return 0;
        return root.val+summ(root.left)+summ(root.right);
    }
    private static int sizeOf(TreeNode root){
        if(root==null) return 0;
        return 1+sizeOf(root.left)+sizeOf(root.right);
    }
    private static int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
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
        display(root);
        System.out.println();
        System.out.println(summ(root));
        System.out.println(sizeOf(root));
        System.out.println(level(root));
    }
}
