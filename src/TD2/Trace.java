package TD2;

/**
 * Created by thsartre on 10/10/2017.
 */
public class Trace {


    private int versement;

    private int retrait;

    public int getVersement() {
        return versement;
    }

    public int getRetrait() {
        return retrait;
    }

    public void IncVersement() {
        this.versement++;
    }

    public Trace(){
        this.versement = 0;
        this.retrait = 0;
    }

    public void IncRetrait() {
        this.retrait++;
    }
}
