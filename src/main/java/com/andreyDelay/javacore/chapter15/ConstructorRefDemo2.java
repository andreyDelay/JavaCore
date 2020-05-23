package main.java.com.andreyDelay.javacore.chapter15;

interface MyFunc3<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T> {
    private T val;

    MyClass3(T v) {
        val = v;
    }

    MyClass3() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        //Создать ссылку на конструктор обобщённого класса MyClass3
        MyFunc3<Integer> myClassCons = MyClass3<Integer>::new;

        //Создать экземпляр класса MyClass3<T>
        //по данной ссылке на конструктор
        MyClass3<Integer> mc = myClassCons.func(100);

        //воспользоваться только что созданным
        //экземпляром класса MyClass<T>
        System.out.println(
                "Значение val в объекте mc равно: " + mc.getVal()
        );
    }
}
