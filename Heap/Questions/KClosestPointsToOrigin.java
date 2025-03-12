//Problem Link-https://leetcode.com/problems/k-closest-points-to-origin/

import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d,int x,int y){
            this.d=d;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Triplet t){
            return this.d-t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int d=x*x+y*y;
            pq.add(new Triplet(d,x,y));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[][] arr=new int[k][2];

        for(int i=0;i<arr.length;i++){
            Triplet t=pq.remove();
            arr[i][0]=t.x;
            arr[i][1]=t.y;
        }

        return arr;

    }
}
