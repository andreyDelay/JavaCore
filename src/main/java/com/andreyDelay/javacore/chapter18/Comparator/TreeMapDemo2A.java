package main.java.com.andreyDelay.javacore.chapter18.Comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}
public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames c1 = new CompLastNames();
        Comparator<String> compLAstThenFirst = c1.thenComparing(new CompThenByFirstName());
        /**
         * Не знаю как передать напрямую в конструктор комбинацию компараторов
         */
        TreeMap<String, Double> tm = new TreeMap<>(compLAstThenFirst);


        tm.put("John Dou", new Double(3434.34));
        tm.put("Tom Smith", new Double(123.22));
        tm.put("Jane Baker", new Double(1378.00));
        tm.put("Tod Hole", new Double(99.22));
        tm.put("Ralph Smith", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Dou");
        tm.put("John Dou", balance + 1000);
        System.out.println("Новый остаток на счете John Dou: " + tm.get("John Dou"));
    }
}
