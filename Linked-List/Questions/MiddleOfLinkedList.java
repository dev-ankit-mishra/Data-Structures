package Questions;
/*
Q2. Middle of the Linked List [LeetCode-876]

Question Link-
https://leetcode.com/problems/middle-of-the-linked-list/
 */
/*
Description-
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
 */
/*
Example-
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example-
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

public class MiddleOfLinkedList {

    /*
    Concept - Creating fast and slow pointer, moving fast pointer 2 steps and slow pointer 1 step,
    by the end list fast pointer will be at the last or at null and
    slow pointer will be at middle or second middle in case of even no. of nodes respectively.
     */

    public ListNode middleNode(ListNode head) {

        //creating two pointers
        ListNode fast = head;
        ListNode slow = head;

        //note-when odd no. of nodes are there fast pointer will be at last node
        //and when there is even no. of nodes fast pointer will be at null.

        while (fast != null && fast.next != null) {

            //moving fast pointer two steps.
            fast = fast.next.next;

            //moving slow pointer one step.
            slow = slow.next;
        }

        //returning slow pointer which is pointing to middle node.
        return slow;
    }
}
