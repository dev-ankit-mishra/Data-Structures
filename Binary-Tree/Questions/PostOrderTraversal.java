//Problem Link-https://leetcode.com/problems/binary-tree-postorder-traversal/
package Questions;

import Implementation.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) {
            st.push(root);
        }
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            ans.add(node.val);
            if (node.left != null) {
                st.push(node.left);
            }
            if (node.right != null) {
                st.push(node.right);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
