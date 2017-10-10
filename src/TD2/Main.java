package TD2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by thsartre on 03/10/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*System.out.println(compte.toString());
        Thread1 th1 = new Thread1(compte);
        Thread2 th2 = new Thread2(compte);
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(compte.toString());*/
        Scanner scanner = new Scanner(System.in);
        String nom;
        String prenom;
        System.out.println("Entrez un nom");
        nom = scanner.nextLine();
        System.out.println("Entrez un prenom");
        prenom = scanner.nextLine();

        Compte compte = new Compte(nom,prenom,0);

        Thread3 th3 = new Thread3(compte);
        Thread3 th4 = new Thread3(compte);

        th3.start();
        th4.start();

        th3.join();
        th4.join();

        System.out.println(compte.toString());
        System.out.println("Retrait : " + compte.getTrace().getRetrait());
        System.out.println("Versement : " + compte.getTrace().getVersement());
        System.out.println("Tab : " + Arrays.toString(compte.getTrace().getFile()));
    }
}
