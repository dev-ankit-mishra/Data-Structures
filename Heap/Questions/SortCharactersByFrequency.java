//Problem Link-https://leetcode.com/problems/sort-characters-by-frequency/?envType=problem-list-v2&envId=heap-priority-queue

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public class Pair implements Comparable<Pair>{
        char ele;
        int freq;
        Pair(char ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            return this.freq-p.freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(char ele: map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));
        }
        String str="";
        while(pq.size()!=0){
            Pair p=pq.remove();
            char ele=p.ele;
            int freq=p.freq;
            while(freq!=0){
                str+=ele;
                freq--;
            }
        }
        return str;
    }
}
