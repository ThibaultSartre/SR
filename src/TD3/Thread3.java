package TD3;

/**
 * Created by thsartre on 24/10/2017.
 */
public class Thread3 extends Thread {

    private Nombre2 nbr;

    public Thread3(Nombre2 nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            nbr.calculeCarre();
            nbr.th = 3;
        }
    }
}