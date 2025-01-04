package Implementation;

public class Deletion {
    ListNode head;

    /*
    Deletion of node
    Concept-Creating a prev node whose next is head and creating a temp pointer which points to head of list and
    moving temp pointer until it reaches the node and prev pointer until it reaches to previous node of node to be deleted.
     Now pointing previous node next to the next of temp node next.
    */
    public void deleteNode(int data) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode temp = head;
        if (head.val == data) {
            head = head.next;
        }
        while (temp != null) {
            if (temp.val == data) {
                prev.next = temp.next;
            }
            prev = prev.next;
            temp = temp.next;

        }
    }
}
