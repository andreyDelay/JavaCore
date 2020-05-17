package main.java.com.andreyDelay.javacore.chapter15;


interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        //Это блочное лямбда-выражение изменяет на обратный
        //порядок следования символов в строке
        StringFunc reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
        System.out.println("Лямбда обращается на " +
                reverse.func("Лямбда")
                );
        System.out.println("А роза упала на лапу азора обращается на " +
                reverse.func("А роза упала на лапу азора")
        );
    }
}
