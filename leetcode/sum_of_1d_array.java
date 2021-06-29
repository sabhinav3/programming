class Solution {
    public int[] runningSum(int[] nums) {
        int i, ans = 0;
        int len = nums.length;
        int sum[] = new int[len];
        for(i=0;i< len; i++)
        {
            ans = ans +nums[i];
            sum[i] = ans;
        }
        
        return sum;
    }
}
