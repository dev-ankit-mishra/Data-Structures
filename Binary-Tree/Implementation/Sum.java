package Implementation;

public class Sum {
    public int sum(Node node){
        if(node==null){
            return 0;
        }

        return node.val+sum(node.left) + sum(node.right);

    }
}
