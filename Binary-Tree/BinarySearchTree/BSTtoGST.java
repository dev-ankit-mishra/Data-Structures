//Problem Link-https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/
package BinarySearchTree;

import Implementation.TreeNode;

import java.util.ArrayList;

public class BSTtoGST {
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorder(root, arr);
        int n = arr.size();
        for (int i = n - 2; i >= 0; i--) {
            arr.get(i).val += arr.get(i + 1).val;
        }
        return root;
    }

    public void inorder(TreeNode root, ArrayList<TreeNode> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);

    }
}
