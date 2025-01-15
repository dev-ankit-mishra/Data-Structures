package Questions;
/*
Q21.Split Linked List in Parts[LeetCode-725]
Question Link-
https://leetcode.com/problems/split-linked-list-in-parts/
 */
/*
Description-
Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.

The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

Return an array of the k parts.
 */
/*
Example-
Input: head = [1,2,3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but its string representation as a ListNode is [].
 */

public class SplitLinkedList {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] node = new ListNode[k];
        ListNode temp = head;
        ListNode newHead = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int sizeOfList = length / k;
        int n = length % k;
        temp = head;
        int i = 0;
        while (temp != null && i != k) {
            if (n != 0) {
                node[i] = newHead;
                int size = sizeOfList;
                while (size != 0) {
                    temp = temp.next;
                    size--;
                }
                if (temp != null) {
                    newHead = temp.next;
                    temp.next = null;
                    temp = newHead;
                }
                n--;
            } else {
                int size = sizeOfList;
                node[i] = newHead;
                while (size != 1) {
                    if (temp != null) {
                        temp = temp.next;
                    }
                    size--;
                }
                if (temp != null) {
                    newHead = temp.next;
                    temp.next = null;
                    temp = newHead;
                }
            }
            i++;
        }
        return node;
    }
}
