package main.java.com.andreyDelay.javacore.chapter14.metaSign;


public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> ob1 = new Stats<>(inums);
        double v1 = ob1.average();
        System.out.println("Average1: " + v1);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> ob2 = new Stats<>(dnums);
        double v2 = ob2.average();
        System.out.println("Average2: " + v2);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> ob3 = new Stats<>(fnums);
        double v3 = ob3.average();
        System.out.println("Average3: " + v3);

        System.out.print("Средние значения ob1, ob2: ");
        if (ob1.sameAvg(ob2))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");

        System.out.print("Средние значения ob1, ob3: ");
        if (ob1.sameAvg(ob3))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");
    }
}
