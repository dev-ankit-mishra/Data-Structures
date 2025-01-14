package Questions;

/*
Q9. Rotate List[LeetCode-83]
Question Link-
https://leetcode.com/problems/rotate-list/
 */
/*
Description-
Given the head of a linked list, rotate the list to the right by k places.
 */
/*
Example-
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
 */
public class RotateList {

    /*
    Concept-First calculate the length of list.
     then subtract with k to find the last node of list after rotation.
     Then start atemp pointer from head to last of node and point it to the head of list.
     Now initialize temp pointer again and
     bring that pointer to the calculated index position and
     make its next to head and point its next to null.
    */

    public ListNode rotateRight(ListNode head, int k) {
        //covering the base condition if k=0 then no rotation is required
        if (k == 0) {
            return head;
        }

        //if head=null then return null
        if (head == null) {
            return null;
        }

        int length = 0;
        ListNode temp = head;

        //Calculate the length of list
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        //pointing last node to head node
        temp.next = head;
        length = length + 1;

        //getting the smaller value of k ,if large value of k is given using below formula.
        k = k % length;
        int index = length - k;

        temp = head;

        //Moving pointer to index which will be last node after rotation
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        //Making next of index node to head
        head = temp.next;

        //pointing next of index node to null
        temp.next = null;

        return head;
    }
}
