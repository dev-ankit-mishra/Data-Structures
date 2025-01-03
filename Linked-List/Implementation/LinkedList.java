package Implementation;
/*
    In this class file all the basic implementation of LinkedList is implemented.Such as-
    1.Insertion at last
    2.Insertion in between
    3.Deletion of Node
    4.Displaying LinkedList
    5.Length of a LinkedList
    6.Searching node using zero-based indexing

 */
public class LinkedList {
    ListNode head;

    /*
    Insertion at last of LinkedList
    Concept-Creating a temp node starting from head and going till end of a LinkedList and
     then pointing last node to node to be inserted.
    */

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

    /*
    Length of a LinkedList
    Concept-Creating a temp pointer which initially points to head node and a count variable with initial value to zero.
     Now moving pointer to last Node and increasing the value of count each time and at last returning the count.
    */
    public int length(){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    //Creating Node class
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


