package main.java.com.andreyDelay.javacore.chapter14.interfaces;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs [] = {'b','r','p','w','z'};

        MyClass<Integer> ob1 = new MyClass<>(inums);
        MyClass<Character> ob2 = new MyClass<>(chs);

        System.out.println("Максимально значение в массиве inums: " + ob1.max());
        System.out.println("Минимальное значение в массиве inums: " + ob1.min());

        System.out.println("Максимально значение в массиве chs: " + ob2.max());
        System.out.println("Минимальное значение в массиве chs: " + ob2.min());
    }
}
