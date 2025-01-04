package Implementation;

public class Displaying {
    ListNode head;

    /*
    Displaying LinkedList
    Concept-Creating a temp variable initialing pointing towards head of list and
     now using loop to move temp pointer to last node and displaying value of node one by one.
    */
    public void displayLinkedList() {
        if (head == null) {
            System.out.println("No Linked List Present");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
