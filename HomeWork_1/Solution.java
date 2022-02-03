package HomeWork_1;

/*
Домашнее задание 1
1. Скачать и настроить JDK
2. Написать программу, в которой есть две переменные типа Integer со значениями.
Значения можно указать в коде программы или ввести с клавиатуры или взять из
аргументов.
3. Если первое число больше второго – написать на экран «Число %s больше %s».
4. Если первое число меньше второго – написать на экран «Число %s меньше %s».
5. В любом случае, вывести на экран сумму чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static Integer first, second;

    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            first = enterTheNumber(console);
            second = enterTheNumber(console);
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong.");
            //e.printStackTrace();
        }
        if (first > second) {
            System.out.println(String.format("Число %s больше %s", first.toString(), second.toString()));
        } else if (first < second) {
            System.out.println(String.format("Число %s меньше %s", first.toString(), second.toString()));
        } else System.out.println(String.format("Число %s равно %s", first.toString(), second.toString()));

        int summ = first + second;
        System.out.println((String.format("Сумма введеных чисел равна %d", summ)));
    }

    static Integer enterTheNumber(BufferedReader console) throws IOException {
        Integer i = null;
        System.out.println("Пожалуйста, введите число.");
        while (i == null) {
            try {
                i = Integer.parseInt(console.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Извините, вы ввели не число. Попробуйте снова.");
            }
        }
        return i;
    }
}
