//Problem Link-https://leetcode.com/problems/path-sum-ii/
package Questions;

import Implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class pathSum2 {
    public List<Integer> copy(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            list.add(i, arr.get(i));
        }
        return list;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        hasPathSum(root, targetSum, arr, ans);
        return ans;
    }

    public void hasPathSum(TreeNode root, int targetSum, List<Integer> arr, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }
        arr.add(root.val);
        List<Integer> arr1 = copy(arr);
        List<Integer> arr2 = copy(arr);
        hasPathSum(root.left, targetSum - root.val, arr1, ans);
        hasPathSum(root.right, targetSum - root.val, arr2, ans);
    }
}
