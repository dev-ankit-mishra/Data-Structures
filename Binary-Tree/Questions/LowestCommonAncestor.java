//Problem Link-https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

package Questions;

import Implementation.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return root;
        boolean pInLst = exists(root.left, p);
        boolean qInLst = exists(root.left, q);
        if (pInLst && qInLst) return lowestCommonAncestor(root.left, p, q);
        if (!pInLst && !qInLst) return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }

    public boolean exists(TreeNode root, TreeNode a) {
        if (root == a) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return exists(root.left, a) || exists(root.right, a);
    }
}
