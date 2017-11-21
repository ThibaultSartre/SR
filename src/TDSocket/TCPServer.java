package TDSocket;
import java.io.*;
import java.net.*;


/**
 * Created by thsartre on 21/11/2017.
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        String clientSentence;
        String capitalizedSentence;
        ServerSocket welcomeSocket = new ServerSocket(56789);

        while(true) {
            System.out.println("Je suis en attente sur le port" + welcomeSocket.getLocalPort());
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient =
                    new BufferedReader(new
                            InputStreamReader(connectionSocket.getInputStream()));
            System.out.println("Socket recu de " + connectionSocket.getInetAddress() + "sur le port " + connectionSocket.getPort());
            DataOutputStream outToClient =
                    new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = inFromClient.readLine();
            capitalizedSentence = clientSentence.toUpperCase() + "\n";
            outToClient.writeBytes(capitalizedSentence);
        }
    }

}
