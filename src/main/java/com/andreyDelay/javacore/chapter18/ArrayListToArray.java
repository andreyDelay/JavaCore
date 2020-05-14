package main.java.com.andreyDelay.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        //создание ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("Содержимое ArrayList arr: " + arr);

        /*Далее создаём новый массив и, используя метод toArray(),
         получаем данные из ArrayList*/
        Integer [] integers = new Integer[arr.size()];
        integers = arr.toArray(integers);

        //переменная для суммирования данных ArrayList arr
        int sum = 0;

        for(int i: arr) sum +=i;

        //переменная для суммирования данных integers
        int sum1 = 0;

        for (int i = 0;i < integers.length; i++) sum1 += integers[i];

        System.out.println("Сумма элементов ArrayList arr: " + sum);
        System.out.println("Сумма элементов массива integers: " + sum1);

    }
}
