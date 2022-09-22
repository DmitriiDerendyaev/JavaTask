public class sumOfDigit {
    public static void main(String[] args) {
        int sumResult = 0;
        int enteredNumber = 123456;

        sumResult += enteredNumber%10;
        enteredNumber = enteredNumber/10;
        sumResult += enteredNumber%10;
        enteredNumber = enteredNumber/10;
        sumResult += enteredNumber%10;
        enteredNumber = enteredNumber/10;
        sumResult += enteredNumber%10;
        enteredNumber = enteredNumber/10;
        sumResult += enteredNumber%10;
        enteredNumber = enteredNumber/10;
        sumResult += enteredNumber%10;

        System.out.println(sumResult);

    }
}
