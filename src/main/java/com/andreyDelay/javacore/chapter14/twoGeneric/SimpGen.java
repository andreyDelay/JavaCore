package main.java.com.andreyDelay.javacore.chapter14.twoGeneric;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen =
                new TwoGen<>(88,"Generics");

        twoGen.showTypes();
        int v = twoGen.getOb1();
        System.out.println("Value: " + v);

        String str = twoGen.getOb2();
        System.out.println("Value: " + str);
    }
}
