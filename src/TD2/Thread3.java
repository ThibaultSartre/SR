package TD2;


/**
 * Created by thsartre on 10/10/2017.
 */
public class Thread3 extends Thread {

    private Compte compte;

    public Thread3(Compte compte) {
        this.compte = compte;
    }

    public void run(){
        double rnd;
        for(int i = 0; i < 5000; i++){
            rnd = Math.random();
            if(rnd < 0.70){
                compte.versement();
            }else{
                compte.retrait();
            }

        }
    }
}
