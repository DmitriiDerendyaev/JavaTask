import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder currentDate = new StringBuilder(scanner.nextLine());
        int counter = 1;
//        int[] arrMarks = new int[5];

        System.out.println(currentDate);
        while(currentDate.toString() != "42"){
            int worstMark = 9;
            if(currentDate.indexOf(String.valueOf(counter)) != -1){
                for (int i = 0; i < 5; i++){
                    worstMark = Math.min(worstMark, scanner.nextInt());
                }
                System.out.println(worstMark);
            }
            else{
                System.err.println("IllegalArguments");
            }
            counter++;
            currentDate.delete(0, currentDate.length());
            String buffString = scanner.nextLine();
            currentDate.append(buffString);
        }
    }
}