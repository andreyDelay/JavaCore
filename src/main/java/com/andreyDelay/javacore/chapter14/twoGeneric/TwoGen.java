package main.java.com.andreyDelay.javacore.chapter14.twoGeneric;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T v1, V v2) {
        ob1 = v1;
        ob2 = v2;
    }

    void showTypes() {
        System.out.println("Тип Т: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
