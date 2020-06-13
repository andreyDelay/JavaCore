package main.java.com.andreyDelay.javacore.chapter14.hierarchy;

public class HierDemo {
    public static void main(String[] args) {

        Gen2<String, Integer> x =
                new Gen2<>("Value: ", 99);
        System.out.print(x.getObject());
        System.out.println(x.getValue());
    }
}
