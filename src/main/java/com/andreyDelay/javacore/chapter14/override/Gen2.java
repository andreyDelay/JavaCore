package main.java.com.andreyDelay.javacore.chapter14.override;

public class Gen2<T> extends Gen<T> {

    Gen2(T object) {
        super(object);
    }

    T getObject() {
        System.out.print("Метод getObject() из класса Gen2: ");
        return object;
    }
}
