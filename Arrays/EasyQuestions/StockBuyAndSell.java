//Problem Link-https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class StockBuyAndSell {
    public int maxProfit(int[] arr) {
        int max=0;
        int bestBuy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>bestBuy){
                max=Math.max(max,arr[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,arr[i]);
        }
        return max;
    }
}
