import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountPoint = 100;
        
        IDefasification function;

        
        System.out.println(Defasification.CalcGravityCenter(0, 1, 6, 10, 100));
        System.out.println(Defasification.CalcGravityCenter(0.6, 1, 6, 8.56, 100));
        System.out.println(Defasification.CalcMedian(0, 1, 6, 10, 100));
    }
}