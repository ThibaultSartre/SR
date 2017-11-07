package TD3;

/**
 * Created by thsartre on 07/11/2017.
 */
public class Nombre2 {
    private int n;

    private int carre;

    private boolean macondition;

    public int th;

    public Nombre2() {
        this.n = 0;
        this.carre = 0;
        this.macondition = true;
        this.th = 0;

    }

    public synchronized void calculeCarre(){
        while(macondition){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        n++;
        carre = n * n;
        macondition = true;
        notifyAll();
    }

    public synchronized String affiche() {
        while(!macondition){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        macondition = false;
        notifyAll();
        return "n = " + n + " carre = "+ carre + " Thread = " + th;
    }
}
