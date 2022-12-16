class Solution {
    public static int numberOfSteps(int num) {
        int amountOfStep = 0;

        for(; num > 0; amountOfStep++){
            if(num % 2 == 1) num--;
            else num /= 2;
        }

        return amountOfStep;
    }
}