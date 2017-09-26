package TD1.Ex5;

/**
 * Created by thsartre on 26/09/2017.
 */
public class ThreadM1 extends Thread {
    private int tab[];
    public ThreadM1(int tab[]){
        this.tab = tab;
    }

    public void run(){
        int i;
        int j;
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 5; j++)
            {
                System.out.print(tab[j]);
            }
            System.out.println();
        }
    }
}

