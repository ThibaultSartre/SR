package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Thread1 extends Thread {

    private Nombre2 nbr;

    public Thread1(Nombre2 nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            nbr.calculeCarre();
            nbr.th = 1;
        }
    }
}