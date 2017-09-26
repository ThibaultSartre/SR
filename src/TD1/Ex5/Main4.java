package TD1.Ex5;

/**
 * Created by thsartre on 26/09/2017.
 */
public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        int []tab= new int[5];
        int i;
        for(i = 0; i < 5; i++)
        {
            tab[i] = 1;
        }
        ThreadM2 mt = new ThreadM2(tab);
        mt.T.start();
    }
}
