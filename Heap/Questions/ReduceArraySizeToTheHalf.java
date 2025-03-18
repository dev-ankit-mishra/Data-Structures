//Problem Link-https://leetcode.com/problems/reduce-array-size-to-the-half/?envType=problem-list-v2&envId=heap-priority-queue
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReduceArraySizeToTheHalf {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            return this.freq-p.freq;
        }
    }
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(int ele: map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));

        }
        int val=0;
        int count=0;
        while(pq.size()!=0){
            Pair p=pq.remove();
            val+=p.freq;
            count++;

            if((arr.length/2)<=val){
                return count;

            }

        }
        return count;

    }
}
