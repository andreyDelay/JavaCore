package main.java.com.andreyDelay.javacore.chapter15;

import java.sql.SQLOutput;

interface StringFunc2 {
    String func(String n);
}

public class LambdaAsArgumentsDemo {
    //первый парамент этого метода имеет тип функционального
    //интерфейса. Следовательно, ему можно передать ссылку на любой
    //экземпляр этого интерфейса, включая экземпляр,
    //создаваемый в лямбда-выражении.
    //А второй парарметр обозначает обрабатываемую символьную строку
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        //ниже приведено простое лямбда-выражение, преобразующее
        //в верхний регистр букв все символы исходной строки,
        //передаваемой методу stringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Результат выполнения - строка в верхнем регистре: " + outStr);

        //А здесь передаётся блочное лямбда-выражение, удаляющее
        //пробелы из исходной строки
        outStr = stringOp((str) -> {
            String result = "";
            for(int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        }, inStr);
        System.out.println("Это строка с удалёнными пробелами: " + outStr);

        //Конечно, можно передать и экземпляр интерфейса StringFunc2,
        //созданный в предыдущем лямбда выражении. Например, после следующего
        //объявления ссылка reverse делается на экземпляр
        //интерфейса StringFunc2
        StringFunc2 reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1; i >= 0; i--)
                    result += str.charAt(i);

            return result;
        };
        //А теперь ссылку reverse можно передать в качестве первого аргумента методу stringOp
        System.out.println("Это обращённая строка: " +
                stringOp(reverse, inStr)
        );
    }
}
