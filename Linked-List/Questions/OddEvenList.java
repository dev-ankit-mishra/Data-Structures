package Questions;
/*
Q24.Odd Even Linked List[LeetCode-328]
Question Link-
https://leetcode.com/problems/odd-even-linked-list/
 */

/*
Description-
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
/*
Example-
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
 */

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode first = new ListNode(-101);
        ListNode second = new ListNode(-101);

        ListNode headA = first;
        ListNode headB = second;
        int i = 1;
        while (temp != null) {
            if (i % 2 != 0) {
                first.next = temp;
                first = first.next;
            } else {
                second.next = temp;
                second = second.next;
            }
            i++;
            temp = temp.next;
        }
        first.next = headB.next;
        second.next = null;
        return headA.next;
    }
}
