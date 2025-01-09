//Problem Link-https://leetcode.com/problems/binary-tree-inorder-traversal/

package Questions;

import Implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while (true) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                TreeNode node = st.pop();
                ans.add(node.val);
                temp = node.right;
            }

        }
        return ans;
    }
}
