package main.java.com.andreyDelay.javacore.chapter14.instanceOf;

public class HierDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);

        Gen2<Integer> iob2 = new Gen2<>(99);

        Gen2<String> strOb = new Gen2<>("Generic test");

        if (iob2 instanceof Gen2<?>)
            System.out.println("Объект iob2 является экземпляром класса Gen2");

        if (iob2 instanceof Gen<?>)
            System.out.println("Объект iob2 является экземпляром класса Gen");
        System.out.println();

        if (strOb instanceof Gen2<?>)
            System.out.println("Объект strOb является экземпляром класса Gen2");

        if (strOb instanceof Gen<?>)
            System.out.println("Объект strOb является экземпляром класса Gen");
        System.out.println();

        if (iob instanceof Gen2<?>)
            System.out.println("Объект iob является экземпляром класса Gen2");

        if (iob instanceof Gen<?>)
            System.out.println("Объект iob является экземпляром класса Gen");

//        if (iob2 instanceof Gen2<Integer>) ERROR
//            System.out.println();
    }
}
