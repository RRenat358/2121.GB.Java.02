import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEcho {

    private static final int CLIENT_PORT = 8358;

    private static DataInputStream inputStream;
    private static DataOutputStream outputStream;

    public static void main(String[] args) throws IOException {
        connect();
        Scanner input = new Scanner(System.in);

        Thread thread = new Thread(() -> {
            while (true) {
                String message = input.nextLine();
                try {
                    messageSend(message);
                } catch (IOException e) {
                    System.err.println("thread/while" + "\n----------");
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        while (true) {
            String messageWait = messageWait();
            if (messageWait == null) {
                break;
            }
            if (messageWait.isEmpty()) {
                continue;
            }

            if (messageWait.equals("/end")) {
                System.out.println("Command send: /end");
                messageSend("PORT [ " + CLIENT_PORT + " ] закрывает соединение");
                System.out.println("Сетевое соединение закрыто");
                break;
            }
            System.out.println("Client message: " + messageWait);
        }


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

    public static void messageSend(String message) throws IOException {
        try {
            outputStream.writeUTF(message);
        } catch (IOException e) {
            System.err.println("Сообщение не отправлено" + "\n----------");
            throw e;
        }
    }

    public static String messageWait() {
        try {
            return inputStream.readUTF();
        } catch (IOException e) {
            System.err.println("Сообщение не получено" + "\n----------");
            return null;
        }
    }


}


//            if (messageWait.equals("/end")) {
//                System.out.println("Client send [/end]");
//                System.out.println("Сетевое соединение закрыто");
//                break;
//            }