//Problem Link-https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
package Questions;

import Implementation.TreeNode;

public class BinaryTreeFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int preLo, int preHi, int inLo, int inHi) {
        if (preLo > preHi || inLo > inHi) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preLo]);
        int r = 0;
        while (inorder[r] != preorder[preLo]) r++;
        int LeftSize = r - inLo;
        root.left = helper(preorder, inorder, preLo + 1, preLo + LeftSize, inLo, r - 1);
        root.right = helper(preorder, inorder, preLo + 1 + LeftSize, preHi, r + 1, inHi);
        return root;
    }
}
