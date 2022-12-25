class Solution {
    public static int[] twoSum(int[] nums, int target) { //[3,2,4]
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    int[] arrays = {i, j};
                    return arrays;
                }
            }
        }
        return nums;
    }
}