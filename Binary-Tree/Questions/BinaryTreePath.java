package Questions;

//Problem Link-https://leetcode.com/problems/binary-tree-paths/

import Implementation.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str=new ArrayList<>();
        path(root,"",str);
        return str;
    }
    public void path(TreeNode root,String s,List<String> arr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            s=s+root.val;
            arr.add(s);
            return;
        }
        path(root.left,s+root.val+"->",arr);
        path(root.right,s+root.val+"->",arr);
    }
}
