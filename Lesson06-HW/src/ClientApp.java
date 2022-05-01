import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

    public static void main(String[] args) throws IOException {
        connect();
        Scanner input = new Scanner(System.in);

        String message = input.nextLine();
        messageSend(message);

    }

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8358;

    private static String host;
    private static int port;
    private static Socket socketClient;
    private static DataInputStream socketInput;
    private static DataOutputStream socketOutput;

    public ClientApp() {
        this(SERVER_HOST, SERVER_PORT);
    }

    public ClientApp(String host, int port) {
        ClientApp.host = host;
        ClientApp.port = port;
    }

    public static void connect() {

        try {
            socketClient = new Socket(SERVER_HOST, SERVER_PORT);
            socketOutput = new DataOutputStream(socketClient.getOutputStream()); //"запись" - в исходящий поток
            socketInput = new DataInputStream(socketClient.getInputStream()); //"чтение" - из входящего потока
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void messageSend(String message) throws IOException {
        try {
            socketOutput.writeUTF(message);
        } catch (IOException e) {
            System.err.println("Сообщение не отправлено на сервер" + "\n----------");
            throw e;
        }
    }


}
