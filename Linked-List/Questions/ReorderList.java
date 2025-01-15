package Questions;

/*
Q18. Reorder List[LeetCode-143]
Question Link-
https://leetcode.com/problems/reorder-list/
 */
/*
Description-
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 */
/*
Example-
Input: head = [1,2,3,4]
Output: [1,4,2,3]
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode temp = middle(head);
        ListNode temp2 = reverse(temp);
        ListNode temp1 = head;
        ListNode dummy = new ListNode(-101);
        while (temp1 != temp2 && temp2 != null) {
            dummy.next = temp1;
            dummy = dummy.next;
            temp1 = temp1.next;

            dummy.next = temp2;
            dummy = dummy.next;
            temp2 = temp2.next;
        }
        head = dummy.next;


    }

    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = current.next;
        while (current != null) {
            if (next != null) {
                next = current.next;
            }
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
