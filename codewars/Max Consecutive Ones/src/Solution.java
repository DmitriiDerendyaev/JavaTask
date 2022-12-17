class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int counterMax = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                counter = 0;
            }
            else{
                counter++;
                counterMax = Math.max(counterMax, counter);
            }
        }

        return counterMax;
    }
}