package TD3;

/**
 * Created by thsartre on 24/10/2017.
 */
public class Thread4 extends Thread {

    private Nombre nbr;

    public Thread4(Nombre nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(nbr.afficheCarre());
        }
    }
}