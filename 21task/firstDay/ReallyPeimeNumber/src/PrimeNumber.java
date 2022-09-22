import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exitCode = 0;
        int enteredNumber;

        System.out.println("Введите рассматриваемое число: ");
        enteredNumber = scanner.nextInt();

        if(enteredNumber<=1){
            exitCode = illegalArgument();
        }
        else {
            JustPrime researchNumber = new JustPrime(enteredNumber);
            System.out.println(researchNumber.isPrimeNumber() + " " + researchNumber.getCountOperation());
        }
        System.exit(exitCode);
    }

    public static int illegalArgument(){
        System.err.println("Illegal Argument");
        return(-1);
    }
}


