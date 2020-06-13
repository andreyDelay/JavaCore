package main.java.com.andreyDelay.javacore.chapter14.hierarchy;

public class Gen2<T, V> extends Gen<T> {

    V value;

    Gen2(T object, V value) {
        super(object);
        this.value = value;
    }

    V getValue() {
        return value;
    }
}
