package TD2;

/**
 * Created by thsartre on 03/10/2017.
 */
public class Prog1 {
    public static void main(String[] args) throws InterruptedException {
        Registre R = new Registre(10);

        MonThread Th1 = new MonThread(R);
        MonThread Th2 = new MonThread(R);

        Th1.start();
        Th2.start();

        Th1.join();
        Th2.join();

        int[] T = R.litRegistre();
        System.out.println("Valeur final du registre");
        for (int aT : T) {
            System.out.println(aT);
        }
    }
}
