package Implementation;

public class Product {
    public int product(Node node){
        if(node==null){
            return 1;
        }
        if(node.val!=0){
            return node.val*product(node.left)*product(node.right);
        }
        return 1;
    }
}
