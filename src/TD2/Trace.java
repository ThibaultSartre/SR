package TD2;

/**
 * Created by thsartre on 10/10/2017.
 */
public class Trace {


    private int versement;

    public String[] getFile() {
        return file;
    }

    private int retrait;

    private String[] file;

    private int cpt;

    public int getVersement() {
        return versement;
    }

    public int getRetrait() {
        return retrait;
    }

    public void IncVersement() {
        this.versement++;
        this.file[this.cpt%5] = "V";
        this.cpt++;
    }

    public Trace(){
        this.versement = 0;
        this.retrait = 0;
        this.cpt = 0;
        this.file = new String[5];
    }

    public void IncRetrait() {
        this.retrait++;
        this.file[this.cpt%5] = "R";
        this.cpt++;
    }
}
