package main.java.com.andreyDelay.javacore.chapter15;

import java.sql.SQLOutput;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        //Здесь лямбда-выражение просто является константным выражением.
        //Когда оно присваивается ссылочной перемеенной типа myNum, получается
        //Экземпляр класса, в котором лямбда-выражение реализует
        //Метод getValue() из функционального интерфейса MyNumber

        myNum = () -> 123.45;

        //Вызвать метод getValue(), предоставляемый
        //присвоенным ранеке лямбда-выражением
        System.out.println("Фиксированное значение: " + myNum.getValue());

        //А здесь используется более сложное выражение
        myNum = () -> Math.random() * 100;

        //В следующих строках кода вызывается лямбда-выражение
        //из пердыдущей строки кода
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Ещё одно случяйное значение : " + myNum.getValue());

        //Лямбда-выражение должно быть совместимо с абстрактным методомб
        //определяемым в функциональном интерфейсе. Поэтому следующая
        //строка кода ошибочна:
    //myNum = () -> "123.45"; //ERROR!
    }
}
