import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        */

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
           list.add(scanner.nextInt());
        }

        Collections.sort(list);

        System.out.println(list.get(1));
    }
}