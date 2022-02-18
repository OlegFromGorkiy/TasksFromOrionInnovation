package HomeWork_2;
/*
Задание 2. Случайности расходятся
- Создать массив на 5 элементов типа int и вывести на экран
- Разделить на два других - в первом массиве только четные числа, во втором - только
нечетные. Оба массива вывести на экран.
- Найти среднее значение в каждом массива и вывести их на экран
*/

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Solution_2 {

    static final String AVERAGE = "Средне значение массива: ";

    public static void main(String[] args) {
        int[] integers = createArray(5);
        System.out.print("Исходный массив целых чисел: ");
        printValues(integers);
        System.out.println(AVERAGE + getAverageValue(integers) + "\n");

        int[] evenNumbers = getEvenNumbers(integers);
        System.out.print("Массив четных чисел исходного массива: ");
        printValues(evenNumbers);
        System.out.println(AVERAGE + getAverageValue(evenNumbers) + "\n");

        int[] oddNumbers = getOddNumbers(integers);
        System.out.print("Массив нечетных чисел исходного массива: ");
        printValues(oddNumbers);
        System.out.println(AVERAGE + getAverageValue(oddNumbers));
    }

    // This method creates some array of random integers. Parameter is array length.
    private static int[] createArray(int numberOfElements) {
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
        return array;
    }

    // This method prints all elements of the argument array to the console in one line.
    private static void printValues(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(String.format("%,d", array[i]));
            if (i != array.length - 1) {
                builder.append("; ");
            } else builder.append(".");
        }
        System.out.println(builder);
    }

    //This method returns array of all even number from the argument array.
    private static int[] getEvenNumbers(int[] array) {
        int resultLength = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                resultLength++;
            }
        }

        int[] result = new int[resultLength];
        int index = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    //This method returns array of all odd number from the argument array.
    private static int[] getOddNumbers(int[] array) {
        int resultLength = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                resultLength++;
            }
        }

        int[] result = new int[resultLength];
        int index = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    // This method returns average value of argument array.
    private static String getAverageValue(int[] array) {
        long sum = 0;
        for (int i : array) {
            sum += i;
        }
        double result = (double) sum / array.length;
        return String.format("%,.1f", result);
    }
}
