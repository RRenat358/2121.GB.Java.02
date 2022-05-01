import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientApp {

    public static void main(String[] args) {

    }

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8358;

    private String host;
    private int port;
    private Socket socketClient;
    private DataInputStream socketInput;
    private DataOutputStream socketOutput;

    public Network() {
        this(SERVER_HOST, SERVER_PORT);
    }

    public Network(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public boolean connect() {
        try {
            socketClient = new Socket(host, port);
            socketOutput = new DataOutputStream(socketClient.getOutputStream()); //"запись" - в исходящий поток
            socketInput = new DataInputStream(socketClient.getInputStream()); //"чтение" - из входящего потока
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
