package main.java.com.andreyDelay.javacore.chapter14.gen;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Generic Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
