package Implementation;

public class Length {
    ListNode head;

    /*
    Length of a LinkedList
    Concept-Creating a temp pointer which initially points to head node and a count variable with initial value to zero.
     Now moving pointer to last Node and increasing the value of count each time and at last returning the count.
    */
    public int length() {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
