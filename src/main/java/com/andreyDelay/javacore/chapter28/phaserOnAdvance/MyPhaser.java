package main.java.com.andreyDelay.javacore.chapter28.phaserOnAdvance;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    //переопределить метод onAdvance()
    // чтобы выполнить определённое количество фаз

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза " + phase + " завершена.\n");
        //вернуть true если все фазы завершены
        if (phase == numPhases || registeredParties == 0) {
            return true;
        }
        return false;
    }
}
