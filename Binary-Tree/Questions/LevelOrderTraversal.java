//Problem Link-https://leetcode.com/problems/binary-tree-level-order-traversal/description/

package Questions;

import Implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int m=levels(root);
        for(int i=0;i<m;i++){
            List<Integer> list=new ArrayList<>();
            preOrderTraversal(root,0,list,i);
            ans.add(list);
        }
        return ans;
    }
    public void preOrderTraversal(TreeNode root,int levels,List<Integer> arr,int n){
        if(root==null){
            return;
        }
        if(levels==n) arr.add(root.val);
        preOrderTraversal(root.left,levels+1,arr,n);
        preOrderTraversal(root.right,levels+1,arr,n);
    }
    public int levels(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}
