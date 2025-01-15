package Questions;
/*
Q16. Palindrome Linked List[LeetCode-234]
Question Link-
https://leetcode.com/problems/palindrome-linked-list/
 */
/*
Description-
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.
 */
/*
Example-
Input: head = [1,2,2,1]
Output: true
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode temp1=head;
        ListNode temp=middle(head);
        ListNode temp2=reverse(temp);
        while(temp1!=temp && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        ListNode next=current.next;
        while(current!=null){
            if(next!=null){
                next=current.next;
            }
            current.next=prev;
            prev=current;
            current=next;
        }

        return prev;
    }
}
