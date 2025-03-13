//Problem Link-https://leetcode.com/problems/top-k-frequent-elements/

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    class Pair implements Comparable<Pair>{
        int e;
        int f;
        Pair(int e,int f){
            this.e=e;
            this.f=f;
        }
        public int compareTo(Pair p){
            return this.f-p.f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int ele: map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));
            System.out.println(map.get(ele));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] arr=new int[k];

        for(int i=0;i<k;i++){
            Pair p=pq.remove();
            arr[i]=p.e;
        }

        return arr;
    }
}
