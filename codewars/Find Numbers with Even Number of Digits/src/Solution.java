class Solution {
    public static int findNumbers(int[] nums) { //nums = [12,345,2,6,7896]
        int countOfDigit = 0;
        int totalCountOfDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            countOfDigit = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                countOfDigit++;
            }
            if (countOfDigit % 2 == 0) totalCountOfDigit++;
        }
        return totalCountOfDigit;
    }
}