//Problem Link-https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
package BinarySearchTree;

import Implementation.TreeNode;

import java.util.Arrays;

public class BSTfromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length - 1;
        int[] inorder = Arrays.copyOf(preorder, n + 1);
        Arrays.sort(inorder);
        return helper(preorder, inorder, 0, n, 0, n);
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
        root.right = helper(preorder, inorder, preLo + LeftSize + 1, preHi, r + 1, inHi);
        return root;

    }
}
