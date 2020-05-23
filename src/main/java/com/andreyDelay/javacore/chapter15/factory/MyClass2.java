package main.java.com.andreyDelay.javacore.chapter15.factory;

public class MyClass2 {
    String str;

    MyClass2(String newValue) {
        str = newValue;
    }

    MyClass2() {
        str = "";
    }

    String getStr() {
        return str;
    }
}
