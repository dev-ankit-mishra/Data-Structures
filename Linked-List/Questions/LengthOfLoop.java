package Questions;

/*
Q7.Find length of Loop[GeeksForGeeks]
QuestionLink-
https://www.geeksforgeeks.org/problems/find-length-of-loop/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
 */
/*
Description-
Given the head of a linked list, determine whether the list contains a loop.
If a loop is present, return the number of nodes in the loop, otherwise return 0.
 */
/*
Example-
Input: LinkedList: 25->14->19->33->10->21->39->90->58->45, c = 4
Output: 7
Explanation: The loop is from 33 to 45. So length of loop is 33->10->21->39-> 90->58->45 = 7.
The number 33 is connected to the last node of the linkedlist to form the loop because according to the input the 4th node from the beginning(1 based indexing)
will be connected to the last node for the loop.
 */
public class LengthOfLoop {
    /*
    Concept-First checking if the linkedList has a cycle or not.
    Then if it has a cycle both pointer will point to same node.
    we just need to traverse one of the pointer to same place while calculating the length.
    */
    public int countNodesinLoop(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //Checking if the LinkedList has cycle or not.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        //Covering the base condition if the list do not have a cycle.
        if (fast == null || fast.next == null) {
            return 0;
        }

        //initializing count variable
        int count = 1;

        //moving one pointer one step ahead of other one
        fast = fast.next;

        //bringing the point to same node while calculating the length of cycle
        while (fast != slow) {
            count++;
            fast = fast.next;
        }
        return count;
    }
}
