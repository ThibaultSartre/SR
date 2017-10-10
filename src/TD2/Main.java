package TD2;

/**
 * Created by thsartre on 03/10/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Compte compte = new Compte("Sartre","Thibault",0);
        /*System.out.println(compte.toString());
        Thread1 th1 = new Thread1(compte);
        Thread2 th2 = new Thread2(compte);
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(compte.toString());*/
        Thread3 th3 = new Thread3(compte);
        Thread3 th4 = new Thread3(compte);

        th3.start();
        th4.start();

        th3.join();
        th4.join();

        System.out.println(compte.toString());
    }
}
