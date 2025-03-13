//Problem Link-https://leetcode.com/problems/find-k-closest-elements/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElement {
    class Pair implements Comparable<Pair>{
        int d;
        int i;
        Pair(int d,int i){
            this.d=d;
            this.i=i;
        }
        public int compareTo(Pair p){
            if(this.d==p.d){
                return this.i-p.i;
            }
            return this.d-p.d;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<Integer>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=arr.length-1;i>=0;i--){
            int d=Math.abs(x-arr[i]);
            pq.add(new Pair(d,i));
            if(pq.size()>k){
                pq.remove();
            }
        }
        for(int i=0;i<k;i++){
            Pair p=pq.remove();
            list.add(arr[p.i]);
        }
        Collections.sort(list);
        return list;
    }
}
