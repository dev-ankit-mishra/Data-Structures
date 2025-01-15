package Questions;

/*
Q29. Reverse Nodes in k-Group[LeetCode-25]
Question Link-
https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
/*
Description-
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
 */
/*
Example-
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int i = 0;
        ListNode A = null;
        ListNode B = null;
        ListNode C = null;
        ListNode D = null;
        while (temp != null) {
            i = k-1;
            B = temp;
            while (i != 0) {
                if (temp == null) {
                    break;
                }
                temp = temp.next;
                i--;
            }
            if (i != 0 || temp==null) {
                break;
            }
            C = temp;
            D = null;
            if (temp != null) {
                D = temp.next;
                temp = D;
                C.next = null;
            }
            C = reverse(B);
            if (A != null) {
                A.next = C;
            }else{
                head=C;
            }
            B.next = D;
            A = B;

        }
        return head;
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
