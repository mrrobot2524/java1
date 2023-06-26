package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Для печати нужно использовать метод Arrays.toString(),
        который формирует из массива строку.
        Затем эту строку можно вывести на экран:
         */
        String[] cars = {"kia", "bmw", "ford"};
        System.out.println(Arrays.toString(cars));

        System.out.println(Arrays.toString(WeekendHelper.getWeekends("short")));
        String[] user = {"Jojo", "Markel", "Totem"};
        String pref = "Mr";
        String[] res = WeekendHelper.addPrefix(user, pref);
        System.out.println(Arrays.toString(res));
        int[] n = {};
        System.out.println(WeekendHelper.calculateSum(n));

        var greetings = "Hello";
        for(var symbol : greetings.toCharArray()){
            System.out.println(symbol);
        }

        int[] mult = {1, 4, 3, 4, 5};
        System.out.println(WeekendHelper.mult(mult));

        int[] numbers = {1, 5, 8, 100};

        System.out.println(Arrays.toString(WeekendHelper.remove(numbers, 0)));


        int[] numb = {1,2,3};
        int[] sameParityNumbers = WeekendHelper.getSameParity(numb);
        System.out.println(Arrays.toString(sameParityNumbers));

        String[] values = {"one", "two", "stop", "three", "four"};

        for(var value : values){
            if(value.equals("stop")){
                break;
            }
            System.out.println(value);
        }
        System.out.println("after loop");

        String[] money1 = {"eur 10", "usd 1", "usd 10", "rub 50", "usd 5", "fu 5"};
        WeekendHelper.getTotalAmount(money1, "usd");
    }


}