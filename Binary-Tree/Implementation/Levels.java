package Implementation;

public class Levels {
    public int lev(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(lev(node.left),lev(node.right));
    }
}
