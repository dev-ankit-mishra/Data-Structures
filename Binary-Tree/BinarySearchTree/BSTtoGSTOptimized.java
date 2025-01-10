//Problem Link-https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/
package BinarySearchTree;

import Implementation.TreeNode;

public class BSTtoGSTOptimized {
    static int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        inorder(root);
        return root;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.right);

        root.val += sum;
        sum = root.val;

        inorder(root.left);


    }
}
