package Implementation;

public class Size {
    public int size(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+size(node.left)+size(node.right);
    }
}
