//Problem Link-https://leetcode.com/problems/validate-binary-search-tree/description/

package BinarySearchTree;

import Implementation.TreeNode;

import java.util.ArrayList;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) >= arr.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);

    }
}
