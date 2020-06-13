package main.java.com.andreyDelay.javacore.chapter14.nonGeneric;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen ob;

        ob  = new NonGen(88);
        ob.showType();
        int v = (Integer) ob.getO();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGen strO = new NonGen("Non generic test");
        strO.showType();
        String str = (String) strO.getO();
        System.out.println("Значение: " + str);
//        ob = strO;
//        v = (Integer) ob.getO(); //ERROR
    }
}
