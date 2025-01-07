package Questions;

import Implementation.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        TreeNode p=invertTree(root.right);
        TreeNode q=root.left;

        if(isSameTree(p,q)){
            return true;
        }
        return false;
    }
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        if(!isSameTree(p.left,q.left)){
            return false;
        }
        if(!isSameTree(p.right,q.right)){
            return false;
        }
        return true;

    }
}
