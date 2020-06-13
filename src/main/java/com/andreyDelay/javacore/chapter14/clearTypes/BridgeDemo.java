package main.java.com.andreyDelay.javacore.chapter14.clearTypes;

public class BridgeDemo {
    public static void main(String[] args) {

        Gen2 str = new Gen2("Generic test");

        System.out.println(str.getObject());
    }
}
