package org.example;

import java.util.Arrays;

public class WeekendHelper {

    public static String[] getWeekends(String format) {
        String[] weekends;
        switch (format) {
            case "long":
                weekends = new String[]{"saturday", "sunday"};
                break;
            case "short":
                weekends = new String[]{"sat", "sun"};
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + format);
        }


        return weekends;
    }

    public static void swap(int[] numbers) {
        var length = numbers.length;
        if (length < 2) {
            return;
        }
        var lastIndex = length - 1;

        var temp = numbers[lastIndex];
        numbers[lastIndex] = numbers[0];
        numbers[0] = temp;
    }

    public static String[] addPrefix(String[] arr, String prefix) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = prefix + " " + arr;
        }
        return result;
    }

    public static Integer calculateSum(int[] num) {
        if (num.length == 0) {
            return null;
        }
        int sum = 0;
        for (int j : num) {
            if (j % 3 == 0) {
                sum += j;
            }
        }
        return sum;
    }


    public static int mult(int[] numbers) {
        int multiply = 1;
        for (int numb : numbers) {
            multiply *= numb;
        }
        return multiply;
    }

    public static int[] remove(int[] values, int index) {
        var result = new int[values.length - 1];

        for (var i = 0; i < values.length; i++) {
            if (i != index) {
                var newIndex = i < index ? i : i - 1;
                result[newIndex] = values[i];
            }
        }
        return result;
    }

    public static int[] getSameParity(int[] numbers) {
        var numCount = numbers.length;
        if (numCount == 0) {
            return new int[0];
        }

        var numNegOrPos = Math.abs(numbers[0] % 2);

        var items = new int[numCount];
        var index = 0;

        for (var number : numbers) {
            if (Math.abs(number % 2) == numNegOrPos) {
                items[index] = number;
                index++;
            }
        }
        return Arrays.copyOfRange(items, 0, index);
    }


    public static void getTotalAmount(String[] money, String currency) {
        int sum = 0;
        for (String s : money) {
            if (currency.equals(s.split(" ")[0]))
                sum += Integer.parseInt(s.split(" ")[1]);

        }
        System.out.println(sum);
    }

}
