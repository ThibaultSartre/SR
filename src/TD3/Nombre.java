package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Nombre {
    private int n;

    private int carre;

    private boolean macondition;

    public Nombre() {
        this.n = 0;
        this.carre = 0;
        this.macondition = false;

    }

    public synchronized void incremente(){
        while(!macondition){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        n++;
        carre = n*n;
        macondition = false;
        notifyAll();
    }

    @Override
    public synchronized String toString() {
        while(macondition){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        macondition = true;
        notifyAll();
        return "Nombre{" +
                "n=" + n +
                ", carre=" + carre +
                '}';
    }
}
