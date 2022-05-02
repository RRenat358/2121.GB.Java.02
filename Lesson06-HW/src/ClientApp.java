import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8358;

    private static String host;
    private static int port;
    private static Socket clientSocket;
    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    
    public static void main(String[] args) throws IOException {
        connect();
        Scanner input = new Scanner(System.in);

        while (true) {
            String message = input.nextLine();
            messageSend(message);
            System.out.println("Server message = " + messageWait());

        }

    }


    public ClientApp() {
        this(SERVER_HOST, SERVER_PORT);
    }

    public ClientApp(String host, int port) {
        ClientApp.host = host;
        ClientApp.port = port;
    }

    public static void connect() {
        try {
            clientSocket = new Socket(SERVER_HOST, SERVER_PORT);
            outputStream = new DataOutputStream(clientSocket.getOutputStream()); //"запись" - в исходящий поток
            inputStream = new DataInputStream(clientSocket.getInputStream()); //"чтение" - из входящего потока
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void messageSend(String message) throws IOException {
        try {
            outputStream.writeUTF(message);
        } catch (IOException e) {
            System.err.println("Сообщение не отправлено" + "\n----------");
            throw e;
        }
    }

    public static String messageWait() throws IOException {
        try {
            return inputStream.readUTF();
        } catch (IOException e) {
            System.err.println("Сообщение не получено" + "\n----------");
            throw e;
        }
    }

}
