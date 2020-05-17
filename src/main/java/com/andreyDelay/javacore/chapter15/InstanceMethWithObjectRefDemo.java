package main.java.com.andreyDelay.javacore.chapter15;

interface MyFunction<T> {
    boolean func(T v1, T v2);
}

//Класс для хранения максимальной температуры за день
class HighTemp {
    private int hTemp;
    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {
    //Метод, возвращающий количество экземпляров объекта,
    //найденных по критериям, задаваемым параметром функционального интерфейса MyFunction
    static <T> int counter(T [] values, MyFunction<T> f, T v) {
        int count = 0;

        for(int i = 0; i < values.length; i++)
            if ((f.func(values[i], v))) count++;

        return count;
    }

    public static void main(String[] args) {
        int count;

        //Создаем массив объектов типа HighTemp
        HighTemp [] weekDayHighs = {
                                        new HighTemp(89), new HighTemp(82),
                                        new HighTemp(90), new HighTemp(89),
                                        new HighTemp(89), new HighTemp(91),
                                        new HighTemp(84), new HighTemp(83)
                                    };
        //Используем метод counter() вместе с массивами объектов типа HighTemp
        //Обращаем внимание на то, что ссылка на метод экземпляра sameTemp() передаётся в качестве второго параметра
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(
                "Дней, когда максимальлная температура была 89: " + count
        );
        //Создаем и спользуем ещё один массив объектов типа HighTemp
        HighTemp [] weekDayHighs2 = {
                                        new HighTemp(32), new HighTemp(12),
                                        new HighTemp(24), new HighTemp(19),
                                        new HighTemp(18), new HighTemp(12),
                                        new HighTemp(-1), new HighTemp(13)
                                    };
        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(
                "Дней, когда максимальная температура была 12: " + count
        );

        //А теперь воспользуемся методом lessThenTemp()
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(
                "Дней, когда температура была меньше 89: " + count
        );
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(
                "Дней, когда температура была меньше 19: " + count
        );
    }
}
