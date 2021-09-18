


// https://leetcode.com/problems/build-array-from-permutation/







class Solution {
    public int[] buildArray(int[] nums) {
        Scanner input = new Scanner(System.in);
        int i,j;
        int size = nums.length; // finding the size of the array
        int temp = 0; // Initialising temp = 0;
        int ans[] = new int[size]; // Initialising new " ans " array
        
        for(i=0 ; i<size ; i++){  // " ans " array
            ans[i] = nums[nums[i]];
        }
        
        // for(i=0; i<size; i++){
        //     System.out.println(ans[i]);
        // }
        
        return ans;
    }
}
