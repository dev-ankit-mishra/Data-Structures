package Implementation;

public class Insertion {
    /*
   Insertion at last of LinkedList
   Concept-Creating a temp node starting from head and going till end of a LinkedList and
    then pointing last node to node to be inserted.
   */
    ListNode head;

    public void insertLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) head = node;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;

    }

    /*
    Insertion in between Nodes
    Concept-Creating a temp node and moving it to index-1 position and
     then pointing node to be inserted to next node temp node and
     pointing next node of temp node to node to be inserted.
    */
    public void insertNode(int data, int index) {
        ListNode node = new ListNode(data);
        if (head == null) head = node;
        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }
}
