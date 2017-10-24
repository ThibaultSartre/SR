package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Thread1 extends Thread {

    private Nombre nbr;

    public Thread1(Nombre nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            nbr.incremente();
        }
    }
}