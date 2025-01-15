//Problem Link-https://leetcode.com/problems/number-of-provinces/description/

package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(i,adj,vis);
                count++;
            }
        }
        return count;
    }
    public void bfs(int i,int[][] adj,boolean[] vis){
        int n=adj.length;
        vis[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int j=0;j<n;j++){
                if(adj[front][j]==1 && !vis[j]){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }

    }
}
