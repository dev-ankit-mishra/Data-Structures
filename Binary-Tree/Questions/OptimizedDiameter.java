//Problem Link-https://leetcode.com/problems/diameter-of-binary-tree/
package Questions;

import Implementation.TreeNode;

public class OptimizedDiameter {
    int maxDia;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        level(root);
        return maxDia;
    }

    public int level(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = level(node.left);
        int right = level(node.right);
        int dia = left + right;
        maxDia = Math.max(maxDia, dia);
        return 1 + Math.max(left, right);
    }
}
