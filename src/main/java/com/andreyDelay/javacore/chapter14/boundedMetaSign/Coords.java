package main.java.com.andreyDelay.javacore.chapter14.boundedMetaSign;

public class Coords<T extends TwoD> {
    T [] objects;

    Coords(T [] objects) {
        this.objects = objects;
    }
}
