package Questions;

/*
Q12. Merge Two Sorted Lists[LeetCode-21]
Question Link-
https://leetcode.com/problems/merge-two-sorted-lists/
 */
/*
Description-
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */
/*
Example-
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node = new ListNode(-101);
        ListNode head = node;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                node.next = temp1;
                node = node.next;
                temp1 = temp1.next;
            } else {
                node.next = temp2;
                node = node.next;
                temp2 = temp2.next;
            }
        }
        if (temp1 != null) {
            node.next = temp1;
        } else {
            node.next = temp2;
        }
        return head.next;
    }
}
