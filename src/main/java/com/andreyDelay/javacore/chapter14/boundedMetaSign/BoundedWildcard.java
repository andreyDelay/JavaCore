package main.java.com.andreyDelay.javacore.chapter14.boundedMetaSign;

public class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("Координаты X, Y: ");
        for (int i = 0; i < c.objects.length; i++) {
            System.out.println(c.objects[i].x + " " +
                                c.objects[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Координаты X, Y, Z:");
        for (int i = 0; i < c.objects.length; i++) {
            System.out.println(c.objects[i].x + " " +
                    c.objects[i].y + " " +
                    c.objects[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Координаты X, Y, Z, T:");
        for (int i = 0; i < c.objects.length; i++) {
            System.out.println(c.objects[i].x + " " +
                            c.objects[i].y + " " +
                            c.objects[i].z + " " +
                            c.objects[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18,4),
                new TwoD(-1,23),
        };

        Coords<TwoD> twoDCoords = new Coords<>(td);
        System.out.println("Содержимое объекта twoDCoords: " );
        showXY(twoDCoords);
//        showXYZ(twoDCoords);
//        showAll(twoDCoords);

        FourD fd [] = {
                new FourD(1,2,3,4),
                new FourD(6,8,14,8),
                new FourD(22,9,4,9),
                new FourD(3,-2,-23,17)
        };

        Coords<FourD> fourDCoords = new Coords<>(fd);
        showXY(fourDCoords);
        showXYZ(fourDCoords);
        showAll(fourDCoords);
    }
}
