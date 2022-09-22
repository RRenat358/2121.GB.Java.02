package Lesson06HW.src;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientApp {

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 13581;

    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    public static void main(String[] args) {
        connect();
        Forward.forwardSend(outputStream);
        Forward.forwardRead(inputStream);

    }

    public static void connect() {
        try {
            Socket clientSocket = new Socket(SERVER_HOST, SERVER_PORT);
            outputStream = new DataOutputStream(clientSocket.getOutputStream());
            inputStream = new DataInputStream(clientSocket.getInputStream());
            System.out.println("Соединение установлено: " + SERVER_HOST + ":" + SERVER_PORT + "\n----------");
        } catch (IOException e) {
            System.err.println("Соединение не установлено");
            e.printStackTrace();
        }
    }

}
