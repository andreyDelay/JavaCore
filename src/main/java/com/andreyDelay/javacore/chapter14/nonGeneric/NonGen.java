package main.java.com.andreyDelay.javacore.chapter14.nonGeneric;

public class NonGen {
    Object o;

    NonGen(Object o) {
        this.o = o;
    }

    Object getO() {
        return o;
    }

    void showType() {
        System.out.println(o.getClass().getName());
    }
}
