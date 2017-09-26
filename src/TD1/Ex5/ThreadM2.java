package TD1.Ex5;

/**
 * Created by thsartre on 26/09/2017.
 */

public class ThreadM2 implements Runnable {
    public Thread T;

    private ThreadM1 T1;

    private int []tab;

    public ThreadM2(int []tab)
    {
        this.tab = tab;
        T1 = new ThreadM1(tab);
        T = new Thread(this);
    }

    public void run()
    {
        T1.start();
        int i;
        int j;
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 5; j++)
            {
                tab[j] = tab[j] + 1;
            }
        }
    }
}
