package Implementation;

public class Searching {
    ListNode head;

    /*
    Searching a Node in LinkedList using zero-based indexing
    Concept-Creating a temp pointer and index variable starting with zero,
     temp which initially points to head.and now moving pointer until it reaches to node and
     at every step adding index value to +1.At last returning the index value.
    */
    public int searchNode(int data) {
        ListNode temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.val == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
}
