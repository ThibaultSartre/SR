package TDSocket;
import java.net.*;
import java.io.*;


/**
 * Created by thsartre on 21/11/2017.
 */
public class MonUDPClient {
    public static void main(String[] args) throws Exception {
        // 1 - Creation du buffer de lecture clavier
        BufferedReader inFromUser = new BufferedReader
                (new InputStreamReader(System.in));
        // 2 - Creation de la socket, n de port par defaut
        DatagramSocket clientSocket = new DatagramSocket();
        System.out.println("socket cliente attachee au port "
                + clientSocket.getLocalPort());
        // 3 - Recuperation de l'@IP du serveur
        InetAddress IPAddress =InetAddress.getByName("localhost");
        // 3bis - preparation de l'echange
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];
        String sentence = inFromUser.readLine();
        sendData = sentence.getBytes();
        int length = sendData.length;
        // 3ter - Initialisation de la (UDP)PDU a emettre
        DatagramPacket sendPacket = new DatagramPacket
                (sendData, sendData.length, IPAddress, 32793);
        System.out.println(sendPacket.getLength() + " octets emis vers le serveur : " + sendPacket.getAddress());
        // 4 - Emission de la (UDP)PDU
        clientSocket.send(sendPacket);

        //5 - Creation d'un buffer de (UDP)PDU arrivant sur la socket
        DatagramPacket receivePacket = new DatagramPacket
                (receiveData, receiveData.length);
        // 5bis - Reception de la (UDP)PDU
        clientSocket.receive(receivePacket);

        // 6 - Affichage des donnees recues
        String modifiedSentence = new String (receivePacket.getData());
        System.out.println("FROM SERVER: " + receivePacket.getAddress());
        System.out.println(receivePacket.getLength() + " octets recus");
        System.out.println("ECHO = " + modifiedSentence);
        // Fermeture de la socket
        clientSocket.close();

    }
}
