//Problem Link-https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans=0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
