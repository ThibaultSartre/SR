package TD1.Ex3_4;

/**
 * Created by thsartre on 26/09/2017.
 */
public class MonThread2 implements  Runnable {
    private String c;
    public Thread T;

    public MonThread2(String c){
        this.c = c;
        T = new Thread(this);
    }

    public void run(){
        System.out.println("String : " + c);
        try{
            Thread.sleep(10000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
