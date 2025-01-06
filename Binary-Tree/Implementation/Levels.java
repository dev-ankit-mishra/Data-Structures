package Implementation;

public class Levels {
    public int lev(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(lev(node.left),lev(node.right));
    }
}
