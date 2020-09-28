package main.java.com.andreyDelay.javacore.chapter09.packageExample;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current [] = new Balance[3];

        current[0] = new Balance("WWW", 123.3);
        current[1] = new Balance("SSS", 157.02);
        current[2] = new Balance("DDD", -12.33);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
