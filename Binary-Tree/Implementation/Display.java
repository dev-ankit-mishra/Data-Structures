package Implementation;

public class Display {
    public void display(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }

}
