import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
//        int sumResult = 0;
//        int enteredNumber = 123456;
//
//        sumResult += enteredNumber%10;
//        enteredNumber = enteredNumber/10;
//        sumResult += enteredNumber%10;
//        enteredNumber = enteredNumber/10;
//        sumResult += enteredNumber%10;
//        enteredNumber = enteredNumber/10;
//        sumResult += enteredNumber%10;
//        enteredNumber = enteredNumber/10;
//        sumResult += enteredNumber%10;
//        enteredNumber = enteredNumber/10;
//        sumResult += enteredNumber%10;
//
//        System.out.println(sumResult);

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        CalcDigit sumDigit = new CalcDigit(scanner.nextInt());

        System.out.println(sumDigit.getSumResult());

    }
}
