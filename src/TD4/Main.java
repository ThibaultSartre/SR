package TD4;

/**
 * Created by thsartre on 21/11/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        LecteursRedacteurs lecteursRedacteurs = new LecteursRedacteurs();
        String [] tab = new String[1];
        ThreadLecture threadLecture1 = new ThreadLecture(lecteursRedacteurs,tab);
        ThreadLecture threadLecture2 = new ThreadLecture(lecteursRedacteurs,tab);
        ThreadEcriture threadEcriture = new ThreadEcriture(lecteursRedacteurs,tab);

        threadEcriture.start();
        threadLecture1.start();
        threadLecture2.start();

        threadEcriture.join();
        threadLecture1.join();
        threadLecture2.join();
    }
}
