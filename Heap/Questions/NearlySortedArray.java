import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySortedArray {
    public ArrayList<Integer> sort(int[] arr, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        ArrayList<Integer> list=new ArrayList<>();

        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k){
                list.add(pq.remove());
            }
        }

        while(pq.size()!=0){
            list.add(pq.remove());
        }

        return list;
    }
}
