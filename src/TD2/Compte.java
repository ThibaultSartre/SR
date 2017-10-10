package TD2;

/**
 * Created by thsartre on 03/10/2017.
 */
public class Compte {
    private String nom;
    private String prenom;
    private int solde;
    private Trace trace;

    public Trace getTrace() {
        return trace;
    }

    public Compte(String nom, String prenom, int solde) {
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
        this.trace = new Trace();
    }
    public synchronized void versement(){
        solde = solde + 10;
        trace.IncVersement();
    }

    public synchronized void retrait(){
        solde = solde - 11;
        trace.IncRetrait();
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", solde=" + solde +
                '}';
    }
}
