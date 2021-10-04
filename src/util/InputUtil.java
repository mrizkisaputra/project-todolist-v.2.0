package util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
