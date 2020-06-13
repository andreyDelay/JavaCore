package main.java.com.andreyDelay.javacore.chapter14.oldcode;

public class Gen<T> {

    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}
