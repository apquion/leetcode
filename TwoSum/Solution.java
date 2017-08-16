public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
    // so first glance maximum n^2, perhaps there is a better solution that is n log n 
        for (int i = 0; i < nums.length ; i++){
            for (int j = 0; j < nums.length; j++){
                if(i < j){
                    if (nums[i] + nums[j] == target){
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }  
        }
        return ans;
    }
}