//Problem Link-https://leetcode.com/problems/diameter-of-binary-tree/
package Questions;

import Implementation.TreeNode;

public class Diameter {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null) return 0;
        int nodeDia=levels(root.left)+levels(root.right);
        int leftDia=diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);
        return Math.max(nodeDia,Math.max(leftDia,rightDia));
    }
    public int levels(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
}
