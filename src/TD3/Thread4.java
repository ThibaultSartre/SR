package TD3;

/**
 * Created by thsartre on 24/10/2017.
 */
public class Thread4 extends Thread {

    private Nombre2 nbr;

    public Thread4(Nombre2 nbr) {
        this.nbr = nbr;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(nbr.affiche());
        }
    }
}