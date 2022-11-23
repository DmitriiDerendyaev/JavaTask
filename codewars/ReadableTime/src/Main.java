

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int seconds = scanner.nextInt();
//
//        int day = (int)TimeUnit.SECONDS.toDays(seconds);
//        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
//
//        long minute = TimeUnit.SECONDS.toMinutes(seconds) -
//                (TimeUnit.SECONDS.toHours(seconds)* 60);
//
//        long second = TimeUnit.SECONDS.toSeconds(seconds) -
//                (TimeUnit.SECONDS.toMinutes(seconds) *60);
//
//        System.out.printf("Hours(%d), Minutes(%d), Seconds(%d)", hours, minute, second);

        Scanner input = new Scanner (System.in);
        int seconds;
        int minutes;
        int hours;
        System.out.print("Enter the number of seconds: ");
        seconds = input.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        int seconds_output = (seconds % 3600) % 60;

        System.out.println("The time entered in hours,minutes and seconds is:");
        System.out.printf("%d:%d:%d", hours, minutes,seconds_output);


    }
}