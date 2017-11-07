package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Thread2 extends Thread {

    private Nombre2 nbr;

    public Thread2(Nombre2 nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            nbr.calculeCarre();
            nbr.th = 2;
        }
    }
}
