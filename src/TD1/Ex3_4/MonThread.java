package TD1.Ex3_4;

/**
 * Created by thsartre on 26/09/2017.
 */

public class MonThread extends Thread{
    private String vers;
    public MonThread(String vers){
        this.vers = vers;
    }

    public String getVers() {
        return vers;
    }

    public void setVers(String vers) {
        this.vers = vers;
    }

    public void run(){
        System.out.println(this.getVers());
    }
}
