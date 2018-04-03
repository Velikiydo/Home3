package home3;

/**
 * Created by Velikiy Dmitriy
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean operat = true;
        while (operat) {
            System.out.println("Введите 1-для запуска калькулятора.Введите 2-для запуска поиска в максимального слова в массиве:");

            int vubor = scanner.nextInt();

            switch (vubor) {
                case 1:// Калькулятор
                    Calculat Calculat = new Calculat();
                    Calculat.Calcul();
                    break;
                case 2:// Поиск максимального слова в массиве
                    Masiv Masiv = new Masiv();
                    Masiv.Slova();
                default:
                    System.out.println("Не допустимое значение");
            }


            System.out.println("Начать программу заново(Y/N)?:");// Повтор операции
            char povtor = scanner.next().charAt(0);
            switch (povtor) {
                case 'Y':
                    operat = true;
                    break;
                case 'N':
                    operat = false;
                    break;
                default:
                    operat = true;
                    break;
            }

        }

    }
}