//Problem Link-https://leetcode.com/problems/count-complete-tree-nodes/?envType=problem-list-v2&envId=binary-search
package Questions;

import Implementation.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
