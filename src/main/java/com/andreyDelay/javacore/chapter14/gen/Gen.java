package main.java.com.andreyDelay.javacore.chapter14.gen;

public class Gen<T> {
    T ob;

    public Gen(T o ) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("T является типом: " + ob.getClass().getName());
    }
}
