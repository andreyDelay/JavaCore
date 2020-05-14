package main.java.com.andreyDelay.javacore.chapter02;

public class IfSample {
    public static void main(String [] args) {
        /*
         * This small class shows introduces us the "if" operator
         */
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x *=2;
        if (x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if(x > y) System.out.println("x теперь больше y");

        /*
         * Result of the next code will never be shown to us
         */
        if(x == y) System.out.println("You will never see this text");
    }
}
