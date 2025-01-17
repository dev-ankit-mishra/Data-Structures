//Problem Link-https://leetcode.com/problems/number-of-islands/description/
package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    bfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i,int j,char[][] grid,boolean[][] vis){
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair front=q.remove();
            int row=front.row;
            int col=front.col;
            //Top
            if(row>0){
                if(grid[row-1][col]=='1' && !vis[row-1][col]){
                    q.add(new Pair(row-1,col));
                    vis[row-1][col]=true;
                }
            }
            //Bottom
            if(row<m-1){
                if(grid[row+1][col]=='1' && !vis[row+1][col]){
                    q.add(new Pair(row+1,col));
                    vis[row+1][col]=true;
                }
            }
            //Left
            if(col>0){
                if(grid[row][col-1]=='1' && !vis[row][col-1]){
                    q.add(new Pair(row,col-1));
                    vis[row][col-1]=true;
                }
            }
            //Right
            if(col<n-1){
                if(grid[row][col+1]=='1' && !vis[row][col+1]){
                    q.add(new Pair(row,col+1));
                    vis[row][col+1]=true;
                }
            }
        }

    }
}
