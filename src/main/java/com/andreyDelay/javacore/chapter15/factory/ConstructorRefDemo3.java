package main.java.com.andreyDelay.javacore.chapter15.factory;


import java.util.function.Predicate;

public class ConstructorRefDemo3 {
    //Создаём ссылку на конструктор класса MyClass
    //В данном случае оператор new обращается к конструктору,
    //принимающему аргумент
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        //Создать ссылку на конструктор класса MyClass
        //В данном случае оператор new обращается к конструктору,
        //принимающему аргумент
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass::new;

        //Создать экземпляр типа класса MyClass, используя фабричный метод
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        //Используем только что созданный экземпляр класса MyClass
        System.out.println(
                "Значение val в объекте mc равно: " + mc.getVal()
        );

        //А теперь создаём экземпляр другого класса, используя метод myClassFactory()
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        //Создаём экземпляр класса MyClass2, используя фабричный метод
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение str в объекте mc2 равно: " + mc2.getStr());
    }
}
