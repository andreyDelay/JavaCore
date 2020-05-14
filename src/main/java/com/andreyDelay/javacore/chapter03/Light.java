package main.java.com.andreyDelay.javacore.chapter03;

public class Light {
    public static void main(String [] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;

        days = 1000L;


        seconds = days * 24 * 60 * 60; // to seconds

        distance = lightSpeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль.");
    }
}
