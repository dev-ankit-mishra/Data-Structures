//Problem Link-https://leetcode.com/problems/balanced-binary-tree/description/
package Questions;

import Implementation.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int balancefactor = Math.abs(level(root.right) - level(root.left));

        if (balancefactor > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int level(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(level(node.left), level(node.right));
    }
}
