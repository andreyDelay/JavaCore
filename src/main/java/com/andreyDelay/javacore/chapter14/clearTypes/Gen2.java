package main.java.com.andreyDelay.javacore.chapter14.clearTypes;

public class Gen2 extends Gen<String> {

    Gen2(String object) {
        super(object);
    }

    String getObject() {
        System.out.println("String method");
        return object;
    }
}
