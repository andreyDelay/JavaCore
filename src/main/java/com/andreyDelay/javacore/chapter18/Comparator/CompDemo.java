package main.java.com.andreyDelay.javacore.chapter18.Comparator;
import java.util.*;

class MyComp {
    private String a;
    private int b;

    public MyComp(String a, int b) {
        this.a = a;
        this.b = b;
    }
    public String getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "MyComp{a=" + a + ", b=" + b + '}';
    }
}

public class CompDemo {
    public static void main(String[] args) {

        TreeSet<MyComp> ts = new TreeSet<>(Comparator.comparing(
                MyComp::getA,(str1, str2) -> str1.compareTo(str2)).thenComparing(MyComp::getB,Comparator.naturalOrder())
        );
        ts.add(new MyComp("z",1));
        ts.add(new MyComp("a",7));
        ts.add(new MyComp("a",13));
        ts.add(new MyComp("b",22));
        ts.add(new MyComp("e",5));
        ts.add(new MyComp("c",0));

        for (MyComp mc: ts)
            System.out.println(mc + " ");
        System.out.println();
    }
}
