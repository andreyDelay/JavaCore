package main.java.com.andreyDelay.javacore.chapter15;

interface MyFunc1<T> {
    int func(T [] values, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] values, T v) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if(values[i] == v) count++;
        }
        return count;
    }
}

public class GenericMethodRefDemo {
    //В качестве первого параметра этого метода указывается
    //функциональный интерфейс MyFunc1, а в качестве двух других
    //параметров - массив и значение, причем оба типа Т
    static <T> int myOp(MyFunc1<T> f, T [] values, T v) {
        return f.func(values, v);
    }

    public static void main(String[] args) {
        Integer [] vals = {1,2,3,4,2,3,4,4,5};
        String [] strs = {"Один","Два","Три","Два"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching, strs, "Два");
        System.out.println("Массив strs содержит " + count + " числа два");
    }
}
