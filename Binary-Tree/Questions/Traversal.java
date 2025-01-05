package Questions;

import Implementation.Node;

public class Traversal {
    public void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.val + " ");
        inorder(node.right);
    }
    public void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val + " ");
    }
}
