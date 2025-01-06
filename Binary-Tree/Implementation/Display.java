package Implementation;

public class Display {
    public void display(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }

}
