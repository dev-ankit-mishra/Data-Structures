package Questions;

/*
Q3. Remove Nth Node From End of List [LeetCode-19]
Question Link-
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
/*
Description-
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
/*
Example-
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example-
Input: head = [1], n = 1
Output: []

Example-
Input: head = [1,2], n = 1
Output: [1]
 */
public class RemoveNthNode {

    /*
    Concept-
    First finding the length of nodes,then subtracting with n to get the index of node to be removed.
    Covering all the base cases and applying basic deletion operation on list.
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;

        //Finding the length of LinkedList
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        //if the length of list is equal to n then list becomes empty.
        if (length == 1 && n == 1) {
            return null;
        }

        //Calculating the index to be removed.
        int index = length - n;

        //Checking if first node is being removed.Then simply pointing head to next node.
        if (index == 0) {
            head = head.next;
            return head;
        }
        temp = head;

        //Reaching to previous node of the node to be removed.
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        //Deleting the node by pointing next node of previous node to next node of node to be removed.
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
