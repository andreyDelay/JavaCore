package main.java.com.andreyDelay.javacore.chapter14;

public class GenMethDemo {

    static <T extends Comparable<T>,V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isIn(2, nums))
            System.out.println("Число 2 содержится в массиве nums.");
        else
            System.out.println("Число 2 отсутствует в массиве nums.");

        System.out.println();

        String strings[] = {"один", "два", "три", "четыре", "пять"};

        if (isIn("два",strings))
            System.out.println("два содержится в массиве nums.");
        else
            System.out.println("два НЕ содержится в массиве nums.");

    }
}
