package main.java.com.andreyDelay.javacore.chapter15;
//Использовать ссылку на метод, чтобы найти маскимально значение в коллекции

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    private int val;
    MyClass(int v) {
        val = v;
    }
    int getVal() {
        return val;
    }
}

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> arrayList = new ArrayList<>();
        arrayList.add(new MyClass(1));
        arrayList.add(new MyClass(4));
        arrayList.add(new MyClass(2));
        arrayList.add(new MyClass(9));
        arrayList.add(new MyClass(3));
        arrayList.add(new MyClass(7));

        //найти максимальное значение, используя метод compareMC()
        MyClass maxValObj = Collections.max(arrayList,UseMethodRef::compareMC);
        MyClass maxValObj1 = Collections.min(arrayList,UseMethodRef::compareMC);
        System.out.println("Максимально значение равно: " + maxValObj.getVal());
        System.out.println(maxValObj1.getVal());
    }
}
