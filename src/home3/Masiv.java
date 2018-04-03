package home3;

/**
 *  Created by Velikiy Dmitriy
 */
import java.util.Scanner;

public class Masiv {
    public void Slova() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        Integer a = scanner.nextInt();
        String[] Array = new String[a];
        for (int d = 0; d < a; d++) {
            System.out.println("Введите слово через Enter:");
            String b = scanner.next();
            Array[d] = b;
        }
        for (int d = 0; d < a; d++) {
            System.out.println(Array[d]);

        }
        int maxslov = 0;// Самое длинное слово в массиве
        for (int d = 1; d < Array.length; d++) {
            if (Array[d].length() > Array[maxslov].length()) {
                maxslov = d;
            }
        }

        System.out.println("Самое длинное слово:"+ Array[maxslov]);
    }
}

