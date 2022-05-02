import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Forwarding {

    public static void messageSend(DataOutputStream outputStream, String message) throws IOException {
        try {
            outputStream.writeUTF(message);
        } catch (IOException e) {
            System.err.println("Сообщение не отправлено" + "\n----------");
            throw e;
        }
    }

    public static String messageWait(DataInputStream inputStream) {
        try {
            return inputStream.readUTF();
        } catch (IOException e) {
            System.err.println("Сообщение не получено" + "\n----------");
            return null;
        }
    }

}
