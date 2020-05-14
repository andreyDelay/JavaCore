package main.java.com.andreyDelay.javacore.chapter18;
/*
Первый пример, демонстрация работы ArrayList
 */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Создание ArrayList типа String в поле класса
        ArrayList<String> arr = new ArrayList<>();

        System.out.println(
                "Начальный размер ArrayList равен: " + arr.size()
        );

        //добавление элементов в коллекцию посредством метода "put"
        arr.add("C");
        arr.add("A");
        arr.add("E");
        arr.add("B");
        arr.add("D");
        arr.add("F");
        arr.add(1, "A2");
        System.out.println(
                "Размер ArrayList после ввода 7-ми элементов: " + arr.size()
        );

        //Вывести ArrayList
        System.out.println("Содержимое ArrayList arr: " + arr);

        //Удачелие пары элементов
        arr.remove("F");
        arr.remove(2);

        System.out.println("Размер ArrayList после удаления элементов: " + arr.size());

        System.out.println("Содержимое ArrayList после удаления элементов: " + arr);


    }
}
