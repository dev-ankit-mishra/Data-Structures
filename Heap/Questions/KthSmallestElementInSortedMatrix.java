//Problem Link-https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/?envType=problem-list-v2&envId=heap-priority-queue
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k) pq.remove();
            }
        }
        return pq.remove();
    }
}
