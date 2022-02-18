package HomeWork_2;
/*
Задание 1. Случайности складываются
- Создать массив на 10 чисел типа int
- Заполнить массив случайными числами, используя класс Random и функцию nextInt()
- Вывести массив на экран одной строкой, разделив элементы пробелом
- Посчитать сумму всех элементов и вывести на экран
- Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */

import java.util.Random;

public class Solution_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        long summ = 0;
        int min = Integer.MAX_VALUE;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
            summ += array[i];
            if (array[i] < min) min = array[i];
            builder.append(String.valueOf(array[i])).append(" ");
        }

        System.out.println(builder.toString().trim());
        System.out.printf("Сумма всех элементов равна %d.\n", summ);
        System.out.printf("Минимальный элемент: %d.", min);
    }
}
