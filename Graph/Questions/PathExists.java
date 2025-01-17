//Problem Link-https://leetcode.com/problems/find-if-path-exists-in-graph/description/

package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathExists {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> arr=new ArrayList<>();
            list.add(arr);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        boolean[] vis=new boolean[n];
        vis[source]=true;
        bfs(list,source,destination,vis);
        if(vis[destination])
            return true;
        else
            return false;

    }
    public void bfs(List<List<Integer>> list,int source,int destination,boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int ele: list.get(front)){
                if(!vis[ele]){
                    vis[ele]=true;
                    q.add(ele);
                    if(ele==destination){
                        return;
                    }
                }
            }
        }
    }
}
