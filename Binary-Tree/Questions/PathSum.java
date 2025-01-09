//Problem Link-https://leetcode.com/problems/path-sum/
package Questions;

import Implementation.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {

            return false;
        }
        if (root.left == null && root.right == null) {
            targetSum = targetSum - root.val;
            if (targetSum == 0) {
                return true;
            }
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
