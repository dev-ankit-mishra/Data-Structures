//Problem Link-https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

package BinarySearchTree;

import Implementation.TreeNode;

public class FlattenBST {
    public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        flatten(root.left);
        flatten(root.right);
        root.left = null;
        root.right = lst;
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        temp.right = rst;
    }
}
