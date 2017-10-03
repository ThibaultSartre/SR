package TD2;

/**
 * Created by thsartre on 03/10/2017.
 */
public class Thread2 extends Thread{
    private Compte compte;

    public Thread2(Compte compte) {
        this.compte = compte;
    }

    public void run(){
        for(int i = 0; i < 100; i++){
                compte.retrait();
        }
    }
}
