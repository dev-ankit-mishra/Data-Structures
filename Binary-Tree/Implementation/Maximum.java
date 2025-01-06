package Implementation;

public class Maximum {
    public int max(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
           return Math.max(node.val,Math.max(max(node.left),max(node.right)));



    }
}
