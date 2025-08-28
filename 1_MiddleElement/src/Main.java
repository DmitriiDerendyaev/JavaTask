import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = IntStream.range(0, 3).mapToObj(i -> scanner.nextInt()).sorted().toList();
        System.out.println(list.get(1));
    }
}