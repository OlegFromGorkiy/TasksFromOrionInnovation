package HomeWork_2;

import java.util.Random;

/*
Задание 3. Противоположности притигиваются
- Создайте два массива на 7 элементов.
- Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в
первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7
отрицательных.
Подсказка: используйте цикл while во время генерации случайных чисел и проверку на
заполненность массива, прежде, чем записывать туда элемент.
- Выведите оба массива на экран
- Создайте новый массив на 7 элементов.
Значением на каждой позиции является суммой значений на позициях с тем же индексом
из положительного и отрицательного массива.
 */

public class Solution_3 {
    public static void main(String[] args) {
        int[] positives = createArray(7, true);
        System.out.println("Array of positive numbers: " + arrayAsString(positives) + "\n");

        int[] negatives = createArray(7, false);
        System.out.println("Array of negative numbers: " + arrayAsString(negatives) + "\n");

        int[] sums = sumOfElements(positives, negatives);
        System.out.println("Array of sums positive and negative numbers: " + arrayAsString(sums));
    }

    // This method creates some array of random integers.
    // First parameter is array length.
    // Second parameter determines the sign of the numbers, if true then numbers are positive.
    private static int[] createArray(int numberOfElements, boolean isPositive) {
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = new Random().nextInt();
            } while (isPositive ? array[i] < 0 : array[i] > 0);
        }
        return array;
    }

    // This method returns the String that contains all elements of the argument array in one line.
    private static String arrayAsString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(String.format("%,d", array[i]));
            if (i != array.length - 1) {
                builder.append("; ");
            } else builder.append(".");
        }
        return builder.toString();
    }

    // This method returns some array.
    // Value at each position is the sum of the values at the positions with the same index from arrays argument.
    private static int[] sumOfElements(int[] first, int[] second) {
        int length = Math.max(first.length, second.length);
        int[] result = new int[length];
        try {
            for (int i = 0; i < length; i++) {
                result[i] = first[i] + second[i];
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Warning! Arrays of different lengths are used as arguments");
        }
        return result;
    }
}
