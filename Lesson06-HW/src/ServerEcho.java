import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEcho {

    private static final int PORT = 8358;

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
            System.out.println("Client message == " + messageWait);
            System.out.println("</while>");
        }


    }

    public static void connect() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println(" === Сервер запущен. Ожидание подключений === " + "\n----------");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился. Порт: " + PORT + "\n----------");

            inputStream = new DataInputStream(clientSocket.getInputStream()); //"запись" - в исходящий поток
            outputStream = new DataOutputStream(clientSocket.getOutputStream()); //"чтение" - из входящего потока
        } catch (IOException e) {
            System.err.println("Ошибка подключения к порту: " + PORT + "\n");
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


//            if (messageWait.equals("/end")) {
//                System.out.println("Client send [/end]");
//                System.out.println("Сетевое соединение закрыто");
//                break;
//            }