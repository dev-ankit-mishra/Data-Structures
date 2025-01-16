//Problem Link-https://leetcode.com/problems/keys-and-rooms/
package Questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] vis=new boolean[n];
        vis[0]=true;
        bfs(0,rooms,vis);

        for(boolean ele: vis){
            if(!ele) return false;
        }
        return true;
    }
    public void bfs(int i,List<List<Integer>> rooms,boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int ele: rooms.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele]=true;
                }
            }
        }
    }
}
