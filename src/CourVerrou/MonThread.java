package CourVerrou;

/**
 * Created by thsartre on 03/10/2017.
 */
public class MonThread extends Thread {
    Registre leRegistre;

    MonThread(Registre R){
        leRegistre = R;
    }

    public void run(){
        for(int turn = 0; turn < 1000000; turn++){
            int Tableau[];
            synchronized (leRegistre) {
                Tableau = leRegistre.litRegistre();
                for (int i = 0; i < Tableau.length; i++) {
                    Tableau[i]++;
                }
                leRegistre.ecritRegistre(Tableau);
            }
        }
    }
}
