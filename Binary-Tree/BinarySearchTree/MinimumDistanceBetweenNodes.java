//Problem Link-https://leetcode.com/problems/minimum-distance-between-bst-nodes/

package BinarySearchTree;

import Implementation.TreeNode;

import java.util.ArrayList;

public class MinimumDistanceBetweenNodes {
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        int sub;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            sub = arr.get(i) - arr.get(i - 1);
            min = Math.min(sub, min);
        }
        return min;
    }

    public void helper(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        helper(root.left, arr);
        arr.add(root.val);
        helper(root.right, arr);
    }
}
