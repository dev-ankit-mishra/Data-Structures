package Questions;

/*
Q15.Reverse Linked List II[LeetCode-92]
Question Link-
https://leetcode.com/problems/reverse-linked-list-ii/
 */
/*
Description-
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right, and return the reversed list.
 */
/*
Example-
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
 */
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = new ListNode(-101);
        prev.next = current;
        ListNode next = current.next;

        for (int i = 1; i < left; i++) {
            current = current.next;
            next = next.next;
            prev = prev.next;

        }
        ListNode first = prev;
        ListNode second = current;

        int counter = right - left + 1;
        for (int i = 0; i < counter; i++) {
            if (next != null) {
                next = current.next;
            }
            current.next = prev;
            prev = current;
            current = next;

        }


        first.next = prev;
        if (left == 1) {
            head = prev;
        }
        second.next = current;

        return head;
    }
}
