import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEcho {

    private static final int CLIENT_PORT = 8358;

    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    public static void main(String[] args) {
        connect();
        Forward.forwardSend(outputStream);
        Forward.forwardRead(inputStream);

    }

    public static void connect() {
        try {
            ServerSocket serverSocket = new ServerSocket(CLIENT_PORT);
            System.out.println(" === Сервер запущен. Ожидание подключений === " + "\n----------");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился. Порт: " + CLIENT_PORT + "\n----------");

            inputStream = new DataInputStream(clientSocket.getInputStream());
            outputStream = new DataOutputStream(clientSocket.getOutputStream());

        } catch (IOException e) {
            System.err.println("Ошибка подключения к порту: " + CLIENT_PORT + "\n----------");
            e.printStackTrace();
        }
    }

}
