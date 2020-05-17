package main.java.com.andreyDelay.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        //Локальная переменная, которая может быть захвачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            //Такое применение переменной num Допустимо, поскольку
            //она не видоизменяется
            int v = num + n;

            //Но следующая строка кода недопустима, поскольку в ней
            //предпринимается попытка видоизменить значение переменной num
        //num++;
            return v;
        };
            //И следующая строка кода приведёт к ошибке, поскольку в ней
            //нарушается действительно завершенное состояние переменной num
        //num = 9;
    }
}
