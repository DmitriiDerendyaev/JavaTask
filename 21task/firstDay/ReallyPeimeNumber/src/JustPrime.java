public class JustPrime {
    private int originalNumber;
    private int countOperation;
    private boolean isPrime;

    public JustPrime(int originalNumber) {
        this.originalNumber = originalNumber;
        countOperation = 1;
        isPrime = true;
    }

    public JustPrime() {
        this.originalNumber = 5;
        countOperation = 1;
        isPrime = true;
    }


    public boolean isPrimeNumber(){
        for (int currentNumber = 2; currentNumber < originalNumber; currentNumber++) {
            if(originalNumber%currentNumber != 0){
                countOperation++;
            }
            else {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public int getCountOperation() {
        return countOperation;
    }
}
