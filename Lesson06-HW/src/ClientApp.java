import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8358;

    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    public static void main(String[] args) throws IOException {
        connect();

        Thread thread = new Thread(() -> {
            Scanner input = new Scanner(System.in);
            while (true) {
                String message = input.nextLine();
                try {
                    Forward.messageSend(outputStream, message);
                } catch (IOException e) {
                    System.err.println("IOException in thread/while" + "\n----------");
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        while (true) {
            String messageWait = Forward.messageRead(inputStream);
            if (messageWait == null) {
                break;
            }
            if (messageWait.isEmpty()) {
                continue;
            }
            if (messageWait.equals("/end")) {
                System.out.println("Command send: /end");
                Forward.messageSend(outputStream, "PORT [ " + SERVER_PORT + " ] закрывает соединение");
                System.out.println("Сетевое соединение закрыто");
                break;
            }
            System.out.println("Server message: " + messageWait);
        }
    }

    public static void connect() {
        try {
            Socket clientSocket = new Socket(SERVER_HOST, SERVER_PORT);
            outputStream = new DataOutputStream(clientSocket.getOutputStream()); //"запись" - в исходящий поток
            inputStream = new DataInputStream(clientSocket.getInputStream()); //"чтение" - из входящего потока
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
