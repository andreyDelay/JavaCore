package main.java.com.andreyDelay.javacore.chapter14.override;

public class OverrideDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        Gen2<Integer> iOb2 = new Gen2<>(99);

        Gen2<String> strOb = new Gen2<>("Generic test");
        System.out.println(iOb.getObject());
        System.out.println(iOb2.getObject());
        System.out.println(strOb.getObject());
    }
}
