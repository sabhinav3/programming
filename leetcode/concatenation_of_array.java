


https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
	    for(int i=0;i<nums.length;i++){
            ans[i + nums.length] = ans[i] = nums[i];
        }	   
        return ans;
    }
}
