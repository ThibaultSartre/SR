package TD1;


/**
 * Created by thsartre on 26/09/2017.
 */

public class Main {
	public static void main(String [] args){
		final int NB_THREAD = 4;
		MonThread mt = null;
		for(int i = 0; i < NB_THREAD; i++){			
			switch(i){
				case 0:
					mt = new MonThread("Et, d'abord, sache");			
					break;
				case 1:
					mt = new MonThread("Que le monde où tu vis est un monde effrayant");					
					break;
				case 2:
					mt = new MonThread("Devant qui le songeur, sous l'infini ployant,");					
					break;
				case 3:
					mt = new MonThread("Lève les bras au ciel et recule terrible.");					
					break;
			}
			mt.start();
			try {
				mt.join();
				System.out.println("Fin tache " + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
