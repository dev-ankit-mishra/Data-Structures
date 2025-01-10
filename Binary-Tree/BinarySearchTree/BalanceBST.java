//Problem Link-https://leetcode.com/problems/balance-a-binary-search-tree/

package BinarySearchTree;

import Implementation.TreeNode;

import java.util.ArrayList;

public class BalanceBST {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return helper(arr, 0, arr.size() - 1);
    }

    public void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);

    }

    public TreeNode helper(ArrayList<Integer> arr, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = helper(arr, lo, mid - 1);
        root.right = helper(arr, mid + 1, hi);
        return root;
    }
}
