package main.java.com.andreyDelay.javacore.chapter14.subclass;

public class HierDemo2 {
    public static void main(String[] args) {

        Gen<String> w = new Gen<>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
