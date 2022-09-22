import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите рассматриваемое число: ");
        JustPrime researchNumber = new JustPrime(scanner.nextInt());

        System.out.println(researchNumber.isPrimeNumber() + " " + researchNumber.getCountOperation());

    }
}
