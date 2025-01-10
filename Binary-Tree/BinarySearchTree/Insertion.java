// Problem Link-https://leetcode.com/problems/insert-into-a-binary-search-tree/
package BinarySearchTree;

import Implementation.TreeNode;

public class Insertion {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode(val);
            root = node;
            return root;
        }
        if (root.val < val) {
            if (root.right == null) {
                TreeNode node = new TreeNode(val);
                root.right = node;
            } else {
                insertIntoBST(root.right, val);
            }

        }
        if (root.val > val) {
            if (root.left == null) {
                TreeNode node = new TreeNode(val);
                root.left = node;
            } else {
                insertIntoBST(root.left, val);
            }

        }
        return root;
    }
}
