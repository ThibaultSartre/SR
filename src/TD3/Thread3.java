package TD3;

/**
 * Created by thsartre on 24/10/2017.
 */
public class Thread3 extends Thread {

    private Nombre nbr;

    public Thread3(Nombre nbr) {
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
        }
    }
}