//Problem Link-https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
package Questions;

import Implementation.TreeNode;

public class BinaryTreeFromPostorderAndInorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode helper(int[] inorder, int[] postorder, int postLo, int postHi, int inLo, int inHi) {
        if (postLo > postHi || inLo > inHi) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postHi]);
        int r = 0;
        while (inorder[r] != postorder[postHi]) r++;
        int RightSize = inHi - r;
        root.left = helper(inorder, postorder, postLo, postHi - RightSize - 1, inLo, r - 1);
        root.right = helper(inorder, postorder, postHi - RightSize, postHi - 1, r + 1, inHi);
        return root;
    }
}
