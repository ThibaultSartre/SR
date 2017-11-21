package TD4;

/**
 * Created by thsartre on 21/11/2017.
 */
public class ThreadEcriture extends Thread {
    private LecteursRedacteurs lecteursRedacteurs;
    private String [] tableau;

    public ThreadEcriture(LecteursRedacteurs lecteursRedacteurs, String [] tab) {
        this.lecteursRedacteurs = lecteursRedacteurs;
        this.tableau = tab;
    }

    public void run(){
        int i;
        for(i = 0;i < 4;++i){
            switch (i){
                case 0:
                    lecteursRedacteurs.entreEcriture();
                    tableau[0] = "Ana";
                    lecteursRedacteurs.sortEcriture();
                    break;
                case 1:
                    lecteursRedacteurs.entreEcriture();
                    tableau[0] = "Baptiste";
                    lecteursRedacteurs.sortEcriture();
                    break;
                case 2:
                    lecteursRedacteurs.entreEcriture();
                    tableau[0] = "Clotilde";
                    lecteursRedacteurs.sortEcriture();
                    break;
                case 3:
                    lecteursRedacteurs.entreEcriture();
                    tableau[0] = "Dwig";
                    lecteursRedacteurs.sortEcriture();
                    break;
            }
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
