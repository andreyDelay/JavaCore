package main.java.com.andreyDelay.javacore.chapter04;

public class HexByte {
    public static void main(String[] args) {
        char [] hex = {
                '0','1','2','3','4','5','6','7',
                '8','9','a','b','c','d','e','f'
        };
        byte b = (byte) 0xf1;
        //В десятичном представлении 0xf1 - это 16
        //в двоичном 11110001
        //после сдвига мы получаем 00001111 - 15 в десятичной
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
