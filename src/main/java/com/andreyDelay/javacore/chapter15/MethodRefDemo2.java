package main.java.com.andreyDelay.javacore.chapter15;

class MyStringOps2 {
    String strReverse(String str) {
        String result = "";

        for(int i = str.length() -1; i >= 0;i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo2 {
    static String stringOP(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность в Java";
        String outStr;
        MyStringOps2 strOps = new MyStringOps2();
        outStr = stringOP(strOps::strReverse,inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}
