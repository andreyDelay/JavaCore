package main.java.com.andreyDelay.javacore.chapter15;

interface DoubleNumericArrayFunc {
    double func(double [] n) throws EmptyArrayException;
}

//На данный момент до конца непонятна работа исключений.
//Так как тема исключений ещё не пройдена
public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
    class LambdaExceptionDemo {
        public static void main(String[] args) throws EmptyArrayException{
            double [] values = {1.0,2.0,3.0,4.0};

            //В этом лямбда-выражении вычисляется среднее числовых значений типа double
            DoubleNumericArrayFunc average = (n) -> {
                double sum = 0;
                if(n.length == 0)
                    throw new EmptyArrayException();

                for(int i = 0;i < n.length;i++)
                    sum += n[i];

                return sum / n.length;
            };
            System.out.println("Среднее равно " + average.func(values));

            //Эта строка кода приводит к генерированию исключения
            System.out.println("Среднее равно " + average.func(new double[0]));
        }
    }

