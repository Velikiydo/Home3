package home3;

/**
 *  Created by Velikiy Dmitriy
 */
import java.util.Scanner;


public class Calculat {
    public void Calcul() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Второе число:");
        double num2 = scanner.nextDouble();
        double result = 0.0; /*значение результата по умолчанию*/
        System.out.println("Введите тип операции:+,-,/,*");
        char calc = scanner.next().charAt(0);
        switch (calc) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Не допустимое значение");
        }
        /* Ответ*/
        System.out.printf("Результат равен=%.4f", result);
    }
}