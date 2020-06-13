package main.java.com.andreyDelay.javacore.chapter14.oldcode;

public class RawDemo {
    public static void main(String[] args) {

        Gen<Integer> i = new Gen<>(88);

        Gen<String> s = new Gen<>("Generic test");

        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getOb();
        System.out.println(d);
    }
}
