package main.java.com.andreyDelay.javacore.chapter15;
interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //Использование строкового интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1;i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Из яблоко в :" + reverse.func("яблоко"));
        System.out.println("Из кокос в :" + reverse.func("кокос"));

        //А теперь тот же интерфейс используется для целочисленных вычислений
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for(int i = 1;i <= n;i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 10 равен " + factorial.func(10));
        System.out.println("Факториал числа 6 равен " + factorial.func(6));
    }
}
