package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Nombre {
    private int n;

    private int carre;

    private int macondition;

    public Nombre() {
        this.n = 0;
        this.carre = 0;
        this.macondition = 3;

    }

    public synchronized void incremente(){
        while(macondition == 2 || macondition == 3 || macondition == 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        n++;
        macondition = 2;
        notifyAll();
    }

    public synchronized void calculeCarre(){
        while(macondition == 3 || macondition == 1 || macondition == 4){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carre = n * n;
        macondition = 3;
        notifyAll();
    }

    public synchronized String afficheN() {
        while(macondition == 1 || macondition == 2 || macondition == 4){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        macondition = 1;
        notifyAll();
        return "n = "+n;
    }

    public synchronized String afficheCarre() {
        while(macondition == 3 || macondition == 2 || macondition == 4){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        macondition = 4;
        notifyAll();
        return "carre = "+carre;
    }
}
