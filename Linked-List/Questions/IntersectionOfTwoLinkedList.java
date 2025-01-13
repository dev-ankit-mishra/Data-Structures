package Questions;

/*
Q4. Intersection of Two Linked Lists [LeetCode-160]
Question Link-
https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
/*
Description-
Given the heads of two singly linked-lists headA and headB,
return the node at which the two lists intersect.
If the two linked lists have no intersection at all, return null.
 */
/*
Example-
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].
There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references.
In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.

 */
public class IntersectionOfTwoLinkedList {

    /*
    Concept- Calculating the length of both list,
    then moving the temp variable of longer list by longerLength-shorterLength position,
    Now comparing each node of both list, if node of both list becomes equal then it is the intersected node.
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        //Calculating the length of first list
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        //Calculating the length of second list
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        int count = 0;

        /*
        calculating the difference in length of list and
        then moving the pointer of longestList to longestLength-ShortestLength position.
        */
        if (lengthA > lengthB) {
            count = lengthA - lengthB;
            for (int i = 0; i < count; i++) {
                tempA = tempA.next;
            }
        } else {
            count = lengthB - lengthA;
            for (int i = 0; i < count; i++) {
                tempB = tempB.next;
            }
        }

        //Comparing each Node to get the intersected node
        while (tempA != null || tempB != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        //if there is no intersected node then return null
        return null;

    }
}
