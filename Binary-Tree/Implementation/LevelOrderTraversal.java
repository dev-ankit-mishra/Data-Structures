package Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public void LevelOrder(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        System.out.println("Level Order Traversals");
        if(root!=null) q.add(root);
        while (!q.isEmpty()){
            TreeNode front=q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
    }

}
