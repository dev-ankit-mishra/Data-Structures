//Problem Link-https://leetcode.com/problems/search-in-a-binary-search-tree/

package BinarySearchTree;

import Implementation.TreeNode;

public class Search {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }if(root.val==val){
            return root;
        }
        if(root.val<val){
            return searchBST(root.right,val);
        }else{
            return searchBST(root.left,val);
        }
    }
}
