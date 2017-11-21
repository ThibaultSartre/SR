package TDSocket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by thsartre on 21/11/2017.
 */
public class SocketThread implements Runnable{
    private Thread thr; // contiendra le thread du client
    private Socket sock; // recevra le socket liant au client
    private DataOutputStream sortie; // pour gestion du flux de sortie
    private BufferedReader entree; // pour gestion du flux d'entrée
    // constructeur
    SocketThread(Socket s) //param s est donné dans main par ss.accept()
    { try
    {
        this.sock=s;
        // fabrication flux IO
        System.out.println("Socket recu de " + sock.getInetAddress() + " port " + sock.getPort());
        sortie = new DataOutputStream(sock.getOutputStream());
        entree = new BufferedReader(new InputStreamReader
                (sock.getInputStream()));
    }
    catch (IOException e){ }
        thr = new Thread(this); //instanciation thread (obligatoire avec runnable)
        thr.start(); //demarrage thread (peut etre mis dans main)
    }

    // methode run
    @Override
    public void run(){
        String clientSentence = null;
        String capitalizedSentence;
        // reception et envoi
        try {
            clientSentence = entree.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        capitalizedSentence = clientSentence.toUpperCase() + "\n";
        try {
            sortie.writeBytes(capitalizedSentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
