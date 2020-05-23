package main.java.com.andreyDelay.javacore.chapter15.factory;

public class MyClass<T> {
    private T val;

    MyClass(T val) {
        this.val = val;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
