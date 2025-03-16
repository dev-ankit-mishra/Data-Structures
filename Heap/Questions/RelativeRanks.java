//Problem Link-https://leetcode.com/problems/relative-ranks/?envType=problem-list-v2&envId=heap-priority-queue
import java.util.Collections;
import java.util.PriorityQueue;

public class RelativeRanks {
    class Pair implements Comparable<Pair>{
        int num;
        int idx;
        Pair(int num,int idx){
            this.num=num;
            this.idx=idx;
        }
        public int compareTo(Pair p){
            return this.num-p.num;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        String[] str=new String[score.length];
        for(int i=0;i<score.length;i++){
            pq.add(new Pair(score[i],i));
        }
        int i=0;
        while(pq.size()!=0){
            Pair p=pq.remove();
            int idx=p.idx;
            if(i==0){
                str[idx]="Gold Medal";
            }else if(i==1){
                str[idx]="Silver Medal";
            }else if(i==2){
                str[idx]="Bronze Medal";
            }else{
                str[idx]=String.valueOf(i+1);
            }
            i++;
        }
        return str;
    }
}
