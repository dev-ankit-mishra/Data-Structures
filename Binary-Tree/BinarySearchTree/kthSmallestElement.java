//Problem Link-https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package BinarySearchTree;

import Implementation.TreeNode;

import java.util.ArrayList;

public class kthSmallestElement {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr.get(k - 1);
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
