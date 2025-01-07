package Questions;
/*
Q1. Delete Node in a Linked List [LeetCode-237]
Question Link-
https://leetcode.com/problems/delete-node-in-a-linked-list/

*/
/*
Description-
There is a singly-linked list head and we want to delete a node , node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node,
node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

1.The value of the given node should not exist in the linked list.
2.The number of nodes in the linked list should decrease by one.
3.All the values before node should be in the same order.
4.All the values after node should be in the same order.

*/
/*
Example-
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5,
 the linked list should become 4 -> 1 -> 9 after calling your function.
 */
public class DeleteNode {

    /*
    Concept -  To copy the value of next node of given node and making last node null.
     */

    public void deleteNode(ListNode node) {
        ListNode temp = node;

        //traversing to second last node of list.
        while (temp.next.next != null) {

            //replacing the value of current node with next node.
            temp.val = temp.next.val;
            temp = temp.next;
        }

        //replacing the value of second last node with last node.
        temp.val = temp.next.val;

        //making last node null.
        temp.next = null;

    }
}

