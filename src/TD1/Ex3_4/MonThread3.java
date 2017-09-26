package TD1.Ex3_4;

/**
 * Created by thsartre on 26/09/2017.
 */
public class MonThread3 implements Runnable {
    private int indice;
    private int []tab;
    public Thread T;


    public MonThread3(int indice,int tab[]){
        this.indice = indice;
        this.tab = tab;
        T = new Thread(this);
    }

    public void run(){
        int tmp = indice * 3 - 1;
        int i;
        for(i = tmp - 2; i <= tmp; i++) {
            tab[i] = i * indice;
        }
    }
}
