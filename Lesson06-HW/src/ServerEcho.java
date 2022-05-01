import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEcho {

    private static final int PORT = 8358;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println(" === Сервер запущен. Ожидание подключений === " + "\n----------");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился. Порт: " + PORT + "\n");

            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

            while (true) {
                try {
                    String message = inputStream.readUTF();
                    if (message.startsWith("/end")) {
                        break;
                    }
                    System.out.println("Client message == " + message);
                } catch (IOException e) {
                    System.out.println("Сетевое соединение было закрыто");
                    break;
                }
            }

        } catch (IOException e) {
            System.err.println("Ошибка подключения к порту: " + PORT + "\n");
            e.printStackTrace();
        }


    }


}
