package main.java.com.andreyDelay.javacore.chapter15;
interface MyFunc2 {
    MyClass2 func(int i);
}

class MyClass2 {
    private int val;

    MyClass2(int v) {
        val = v;
    }
    MyClass2() {
        val = 0;
    }
    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        //Создать ссылку на конструктор класса MyClass
        //Метод func() из интерфейса MyFunc2 принимает аргумент,
        //поэтому оператор new обращается к параметризированному
        //конструктору класса MyClass, а не к его конструктору по умолчанию

        MyFunc2 myClassCons = MyClass2::new;

        MyClass2 mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
