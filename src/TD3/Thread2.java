package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Thread2 extends Thread {

    private Nombre nbr;

    public Thread2(Nombre nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(nbr.toString());
        }
    }
}
