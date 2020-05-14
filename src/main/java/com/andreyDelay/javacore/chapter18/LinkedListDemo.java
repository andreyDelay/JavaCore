package main.java.com.andreyDelay.javacore.chapter18;


import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Создание связанного списка
        LinkedList<String> linkedList = new LinkedList<>();

        //добавление элементов в список
        linkedList.add("F"); //сложность O(1)
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z"); //сложность O(1)
        linkedList.addFirst("A"); //сложность O(1)
        linkedList.add(1, "A2"); //сложность O(n/2) ?

        System.out.println(
                "Исходное содержимое связанного списка linkedList: " + linkedList
        );

        //Удаление элементов из связанного списка
        linkedList.remove("F"); //сложность O(n/2) ?
        linkedList.remove(2); //сложность O(1)
        System.out.println(
                "Содержимое связанного списка linkedList после удаления: " + linkedList
        );

        //Удаляем первый и последний элементы
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(
                "Содержимое связанного списка linkedList после удаления" +
                        "первого и последнего элементов: " + linkedList
        );

        //получить и присвоить значение
        String value = linkedList.get(2);
        linkedList.set(2, value + " changed");

        System.out.println(
                "Содержимое связанного списка linkedList после изменения: " + linkedList
        );



    }
}
