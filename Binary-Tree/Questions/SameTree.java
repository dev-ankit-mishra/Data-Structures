
//Problem Link- https://leetcode.com/problems/same-tree/description/
package Questions;

import Implementation.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        else if(isSameTree(p.left,q.left)==false){
            return false;
        }
        else if(isSameTree(p.right,q.right)==false){
            return false;
        }
        return true;
    }
}
