package main.java.com.andreyDelay.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.bigocheatsheet.com");
        System.out.println(Address);

        InetAddress SW[] = InetAddress.getAllByName("www.google.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
