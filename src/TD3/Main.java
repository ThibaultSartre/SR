package TD3;


import TD2.*;

import java.io.IOException;

/**
 * Created by thsartre on 24/10/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Nombre nbr = new Nombre();
        Thread1 th1 = new Thread1(nbr);
        Thread2 th2 = new Thread2(nbr);
        Thread3 th3 = new Thread3(nbr);
        Thread4 th4 = new Thread4(nbr);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        th1.interrupt();
        th2.interrupt();
        th3.interrupt();
        th4.interrupt();

        th1.join();
        th2.join();
        th3.join();
        th4.join();

    }
}
