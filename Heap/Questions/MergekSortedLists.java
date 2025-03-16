//Problem Link-https://leetcode.com/problems/merge-k-sorted-lists/?envType=problem-list-v2&envId=heap-priority-queue

import Questions.ListNode;
import java.util.PriorityQueue;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();


        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode head=new ListNode(-1);
        ListNode temp=head;

        while(pq.size()!=0){
            ListNode node=new ListNode(pq.remove());
            temp.next=node;
            temp=temp.next;
        }
        temp.next=null;
        return head.next;
    }
}
