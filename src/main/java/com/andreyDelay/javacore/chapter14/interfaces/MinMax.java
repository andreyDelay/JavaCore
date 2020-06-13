package main.java.com.andreyDelay.javacore.chapter14.interfaces;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
