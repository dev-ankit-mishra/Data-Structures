package Questions;

/*
Q10. Reverse Linked List[Iterative] [Leetcode-206]
Question Link-
https://leetcode.com/problems/reverse-linked-list/
 */
/*
Description-
Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
/*
Example-
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */
public class ReverseIterative {
    /*
    Concept-Creating three pointers,initially  first pointer prev is pointing to null,
     second pointer current is pointing to head,third pointer is pointing to next to current node.
     Now traversing current node to null and at each step pointing current node to prev and
     replacing the position of each pointer one step ahead.At last prev will be the head of reversed list.
    */
    public ListNode reverseList(ListNode head) {
        //covering the base condition checking if list is empty or have 1 node only
        if (head == null || head.next == null) {
            return head;
        }
        //pointing to head
        ListNode current = head;
        //pointing to null
        ListNode prev = null;
        //pointing to next of current node
        ListNode next = current.next;

        //traversing to the end of list util current node becomes null
        while (current != null) {
            //checking if next is not equal to null
            if (next != null) {
                //moving next to current next
                next = current.next;

            }
            //pointing next of current to prev
            current.next = prev;
            //moving prev to current
            prev = current;
            //moving current to next
            current = next;

        }
        //returning the prev node which is the head of reversed list
        return prev;
    }
}
