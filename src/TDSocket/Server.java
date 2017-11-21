package TDSocket;

import java.net.ServerSocket;

/**
 * Created by thsartre on 21/11/2017.
 */
public class Server {

    public static void main(String[] args) {
        try
        {
            int port=56789;
            ServerSocket socketaccueil = new ServerSocket(port);
            // ouverture d'un socket serveur sur port
            while (true) {
                // attente en boucle de connexion (bloquant sur .accept)
                new SocketThread(socketaccueil.accept());
                // un client se connecte, un nouveau thread client est lancé
            }
        }
        catch (Exception e) {e.printStackTrace();}
    }
}
