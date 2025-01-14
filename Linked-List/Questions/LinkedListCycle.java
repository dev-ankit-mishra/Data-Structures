package Questions;

/*
Q5. Linked List Cycle [LeetCode-141]
Question Link-
https://leetcode.com/problems/linked-list-cycle/
 */
/*
Description-
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */
/*
Example-
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example-
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 */
public class LinkedListCycle {

    /*
    Concept-Creating two pointer one fast which moves 2 steps and other slow pointer which moves one position at a time.
    Then comparing nodes of fast and slow pointer if the become equal that means cycle is present.
    */


    public boolean hasCycle(ListNode head) {

        //Creating two pointers
        ListNode fast = head;
        ListNode slow = head;

        //Comparing nodes of fast and slow pointers.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        //if the did not become equal that means no cycle is present in list.
        return false;
    }
}
