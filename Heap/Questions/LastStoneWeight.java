//problem Link-https://leetcode.com/problems/last-stone-weight/

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()!=1){
            int i=pq.remove();
            int j=pq.remove();
            pq.add(Math.abs(i-j));
        }
        return pq.remove();
    }
}
