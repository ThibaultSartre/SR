package TD4;

/**
 * Created by thsartre on 21/11/2017.
 */
public class LecteursRedacteurs {
    private boolean redacteurPresent = false;
    private int nbLecteurs = 0;

    synchronized void entreLecture(){
        while(this.redacteurPresent){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        nbLecteurs++;
    }

    synchronized void sortLecture(){
        nbLecteurs--;
        notifyAll();
    }

    synchronized void entreEcriture(){
        while((this.redacteurPresent)||(this.nbLecteurs > 0)){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            this.redacteurPresent=true;
        }
    }

    synchronized void sortEcriture(){
        this.redacteurPresent=false;
        notifyAll();
    }
}
