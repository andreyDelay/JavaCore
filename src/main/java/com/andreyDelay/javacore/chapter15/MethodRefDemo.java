package main.java.com.andreyDelay.javacore.chapter15;

class MyStringOps {
    static String strReverse(String str) {
        String result = "";

        for(int i = str.length() -1; i >= 0;i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo {
    //В этом методе функциональный интерфейс указывается в качестве типа первого его параметра
    //Следовательно, ему может быть передан любой экземпляр этого интерфейса
    //включая ссылку на метод
    static String stringOP(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность в Java";
        String outStr;
        //Здесь ссылка на метод strReverse() передаётся методу stringOp()
        outStr = stringOP(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}
