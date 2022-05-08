package Lesson06HW.src;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Forward {

    public static void forwardSend(DataOutputStream outputStream) {
        Thread thread = new Thread(() -> {
            Scanner input = new Scanner(System.in);
            while (true) {
                String message = input.nextLine();
                try {
                    messageSend(outputStream, message);
                } catch (IOException e) {
                    System.err.println("IOException in thread/while" + "\n----------");
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public static void forwardRead(DataInputStream inputStream) {
        while (true) {
            String messageWait = messageRead(inputStream);
            if (messageWait == null) {
                break;
            }
            if (messageWait.isEmpty()) {
                continue;
            }
            if (messageWait.equals("/end")) {
                System.out.println("Command send: /end");
                System.out.println("Сетевое соединение закрыто");
                break;
            }
            System.out.println("Client message: " + messageWait);
        }
    }

    public static void messageSend(DataOutputStream outputStream, String message) throws IOException {
        try {
            outputStream.writeUTF(message);
        } catch (IOException e) {
            System.err.println("Сообщение не отправлено" + "\n----------");
            throw e;
        }
    }

    public static String messageRead(DataInputStream inputStream) {
        try {
            return inputStream.readUTF();
        } catch (IOException e) {
            System.err.println("Сообщение не получено" + "\n----------");
            return null;
        }
    }

}
