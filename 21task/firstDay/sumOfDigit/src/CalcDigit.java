public class CalcDigit {
    private int sumResult;
    private int enteredNumber;

    CalcDigit(int enteredNumber){
        this.enteredNumber = enteredNumber;
    }
    CalcDigit(){

    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumber = enteredNumber;
    }
    public int getSumResult() {
        while (enteredNumber != 0){
            sumResult += enteredNumber%10;
            enteredNumber = enteredNumber/10;
        }

        return sumResult;
    }




}
