package TD1;

import java.lang.reflect.Executable;

/**
 * Created by thsartre on 26/09/2017.
 */
public class Main2 extends Thread{
    public static void main(String[] args) throws Exception{
        MonThread2 latache = new MonThread2("Salut2");
        latache.T.start();
        try{
            Thread.sleep(10000);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin");
    }
}
