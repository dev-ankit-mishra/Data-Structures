
//Problem Link- https://leetcode.com/problems/invert-binary-tree/

package Questions;

import Implementation.Node;

public class InvertTree {

    public Node invertTree(Node root) {
        if (root == null) {
            return root;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
