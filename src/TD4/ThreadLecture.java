package TD4;

/**
 * Created by thsartre on 21/11/2017.
 */
public class ThreadLecture extends Thread {
    private LecteursRedacteurs lecteursRedacteurs;
    private String[] tableau;

    public ThreadLecture(LecteursRedacteurs lecteursRedacteurs, String [] tab) {
        this.lecteursRedacteurs = lecteursRedacteurs;
        this.tableau = tab;
    }

    public void run(){
        int i;
        for(i = 0;i < 10;++i){
            lecteursRedacteurs.entreLecture();
            System.out.println(tableau[0].toString());
            lecteursRedacteurs.sortLecture();
            try {
                sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
