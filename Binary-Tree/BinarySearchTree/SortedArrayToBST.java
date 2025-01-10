//Problem Link-https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

package BinarySearchTree;

import Implementation.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr, lo, mid - 1);
        root.right = helper(arr, mid + 1, hi);
        return root;
    }
}
