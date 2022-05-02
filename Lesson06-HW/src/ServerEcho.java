import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEcho {

    private static final int CLIENT_PORT = 8358;

    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    public static void main(String[] args) throws IOException {
        connect();
        Forward.forwardSend(outputStream);
        Forward.forwardRead(inputStream);


/*
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
                Forward.messageSend(outputStream, "PORT [ " + CLIENT_PORT + " ] закрывает соединение");
                System.out.println("Сетевое соединение закрыто");
                break;
            }
            System.out.println("Client message: " + messageWait);
        }
*/
    }


    public static void connect() {
        try {
            ServerSocket serverSocket = new ServerSocket(CLIENT_PORT);
            System.out.println(" === Сервер запущен. Ожидание подключений === " + "\n----------");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился. Порт: " + CLIENT_PORT + "\n----------");

            inputStream = new DataInputStream(clientSocket.getInputStream()); //"запись" - в исходящий поток
            outputStream = new DataOutputStream(clientSocket.getOutputStream()); //"чтение" - из входящего потока
        } catch (IOException e) {
            System.err.println("Ошибка подключения к порту: " + CLIENT_PORT + "\n");
            e.printStackTrace();
        }
    }

}
