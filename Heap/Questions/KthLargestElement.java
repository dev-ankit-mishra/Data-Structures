//Problem Link-https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int ele: nums){
            pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.remove();

    }
}
