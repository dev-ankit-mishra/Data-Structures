//Problem Link-https://leetcode.com/problems/balanced-binary-tree/description/
package Questions;

import Implementation.TreeNode;

public class BalancedBinaryTreeOptimized {
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = {true};
        level(root, ans);
        return ans[0];
    }

    public int level(TreeNode node, boolean[] ans) {
        if (node == null) {
            return 0;
        }
        int left = level(node.left, ans);
        int right = level(node.right, ans);
        if (Math.abs(left - right) > 1) {
            ans[0] = false;
        }
        return 1 + Math.max(left, right);
    }
}
