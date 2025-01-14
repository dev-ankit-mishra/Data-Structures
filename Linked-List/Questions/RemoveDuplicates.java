package Questions;

/*
Q8. Remove Duplicates from Sorted List [LeetCode-83]
Question Link-
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
/*
Description-
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.
 */
/*
Example-
Input: head = [1,1,2]
Output: [1,2]
 */
public class RemoveDuplicates {
    /*
    Concept-Check the adjacent node if it is equal to current node then point next to its next node.
     And move temp pointer only if it is no equal to its adjacent node.
    */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp != null) {
            //Note-only move temp pointer if current node val  is not equal to next node val.
            if (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
