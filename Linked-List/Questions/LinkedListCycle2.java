package Questions;

import java.util.HashMap;
import java.util.HashSet;

/*
Q6. Linked List Cycle II [LeetCode-142]
Question Link-
https://leetcode.com/problems/linked-list-cycle-ii/
 */
/*
Description-
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

 */
/*
Example-
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycle2 {
    //Method-1
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }


    //Method-2
/*
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> map=new HashSet<>();
        ListNode temp=head;

        while(temp!=null){
            if (map.contains(temp)) {
                return temp;
            }
            else{
                map.add(temp);
                temp=temp.next;
            }
        }
        return head;
    }
*/
}
