package TD3;

/**
 * Created by thsartre on 17/10/2017.
 */
public class Nombre {
    private int n;

    private int carre;

    public Nombre() {
        this.n = 0;
        this.carre = 0;
    }

    public void incremente(){
        n++;
        carre = n*n;
    }

    @Override
    public String toString() {
        return "Nombre{" +
                "n=" + n +
                ", carre=" + carre +
                '}';
    }
}
