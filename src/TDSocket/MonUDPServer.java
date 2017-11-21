package TDSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by thsartre on 21/11/2017.
 */
public class MonUDPServer {

    public static void main(String[] args) throws Exception{
        // creation d'une socket sur le port 9876. Le serveur attend sur ce port
        DatagramSocket serverSocket = new DatagramSocket(32793);
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        while(true){
            System.out.println("Socket serveur en ecoute sur le port local " + serverSocket.getLocalPort());
            // Traitement de la reception
            // creation d'un buffer de (UDP)PDU arrivant sur la socket
            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);
            // reception d'un (UDP)PDU sur la socket
                    serverSocket.receive(receivePacket);
            System.out.println("Segment UDP recu FROM" + receivePacket.getAddress() + " port " + receivePacket.getPort());
            System.out.println(receivePacket.getLength() + " octets recus");
            // rangement du champ de donnees de l'(UDP)PDU dans une string
                    String sentence = new String(receivePacket.getData());
            System.out.println("ECHO = " + sentence);
            // recuperation de l'adresse IP de l'emetteur
                    InetAddress IPAddress = receivePacket.getAddress();
            // recuperation du n de port de l'emetteur
                    int port = receivePacket.getPort();
            // traitement du champ de donnees
            String capitalizedSentence = sentence.toUpperCase();

            // Traitement de l'emission

            // initialisation du champ de donnees de l'(UDP) PDU a emettre
            sendData = capitalizedSentence.getBytes();

            // initalisation de l'(UDP)PDU en reponse, donc a l'@IP et n°port
            DatagramPacket sendPacket = new DatagramPacket(sendData,
                    sendData.length, IPAddress, port);

            // emission de l'(UDP)PDU en reponse
            serverSocket.send(sendPacket);

        }

    }
}
