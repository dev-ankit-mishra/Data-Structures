//Problem Link-https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/?envType=problem-list-v2&envId=heap-priority-queue

import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    class Pair implements Comparable<Pair>{
        int s;
        int i;
        public Pair(int s,int i){
            this.s=s;
            this.i=i;
        }
        public int compareTo(Pair p){
            if(this.s==p.s){
                return this.i-p.i;
            }
            return this.s-p.s;
        }

    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }else break;

            }
            pq.add(new Pair(count,i));
        }
        int[] arr=new int[k];
        int j=0;
        while(pq.size()!=0 && j<k){
            Pair p=pq.remove();
            int i=p.i;
            arr[j++]=i;
        }
        return arr;
    }
}
