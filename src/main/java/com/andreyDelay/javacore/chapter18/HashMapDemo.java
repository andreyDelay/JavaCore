package main.java.com.andreyDelay.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dou", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hole", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        //получаем множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счёт Джона Доу
        double balance = hm.get("John Dou");
        hm.put("John Dou", balance + 1000);
        System.out.println("Новый остаток на счете John Dou: " + hm.get("John Dou"));
    }
}
