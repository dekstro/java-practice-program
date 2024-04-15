package tree;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node=node;
        this.level=level;
    }
}
public class levelOrderUsingQueue {
    public static void levelOrder(TreeNode root){
        Queue<Pair> q=new LinkedList<>();
        if(root!=null) q.add(new Pair(root, 0));
        
    } 
    public static void main(String[] args) {
        
    }
}
