//Problem Link-https://leetcode.com/problems/sort-array-by-increasing-frequency/

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {
    class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            if(this.freq==p.freq){
                return p.ele-this.ele;
            }
            return this.freq-p.freq;
        }
    }
    public int[] frequencySort(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int ele:map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));
        }
        int[] ans=new int[nums.length];
        int i=0;
        while(pq.size()!=0){
            Pair p=pq.remove();
            int ele=p.ele;
            int freq=p.freq;
            while(freq!=0){
                ans[i++]=ele;
                freq--;
            }

        }
        return ans;
    }
}
