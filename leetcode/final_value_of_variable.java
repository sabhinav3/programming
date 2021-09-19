/*

Platform : Leetcode
Problem Name : 2011. Final Value of Variable After Performing Operations
Problem Link : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

*/





class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
    	for(int i=0;i<operations.length;i++){
    		if(operations[i].charAt(1)=='+'){
                ans++;
            }
    		else{
                ans--;
            }
    	}
    	return ans;  
    }
}
