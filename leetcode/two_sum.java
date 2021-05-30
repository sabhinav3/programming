/*

Problem Name : Two Sum
Problem Link : https://leetcode.com/problems/two-sum/
Platform : Leetcode

*/

// Solution


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0,0};
        for(int i = 0; i < nums.length; i++){
            int number = nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    if(number + nums[j] == target){
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
        }
        return answer;
    }
}
