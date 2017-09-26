package TD1;

import java.util.ArrayList;

/**
 * Created by thsartre on 26/09/2017.
 */

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        final int NB_THREAD = 4;
        int []tab = new int[12];
        MonThread3 mt = null;
        int i;
        ArrayList<MonThread3> listThread = new ArrayList<MonThread3>();
        for(i = 0; i < NB_THREAD; i++){
            mt = new MonThread3(i+1,tab);
            listThread.add(mt);
            mt.T.start();
        }
        for(i = 0; i < NB_THREAD; i++)
        {
            listThread.get(i).T.join();
        }
        for(i = 0; i < 12; i++)
        {
            System.out.println("Ligne " + i +" Valeur " + tab[i] + "\n");
        }
    }
}
