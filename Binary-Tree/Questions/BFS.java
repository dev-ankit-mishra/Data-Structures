//Problem Link-https://leetcode.com/problems/binary-tree-level-order-traversal/

package Questions;

import Implementation.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        if (root != null) {
            q.add(new Pair(root, 0));
        }
        int prevlvl = level(root);
        for (int i = 0; i < prevlvl; i++) {
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        while (!q.isEmpty()) {
            Pair front = q.remove();
            ans.get(front.level).add(front.node.val);
            if (front.node.left != null) {
                q.add(new Pair(front.node.left, front.level + 1));
            }
            if (front.node.right != null) {
                q.add(new Pair(front.node.right, front.level + 1));
            }

        }
        return ans;
    }

    public int level(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(level(root.left), level(root.right));
    }

    public class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}
