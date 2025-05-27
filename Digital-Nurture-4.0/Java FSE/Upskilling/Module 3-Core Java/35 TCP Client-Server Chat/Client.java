import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Thread readThread = new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("Server: " + msg);
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        });

        Thread writeThread = new Thread(() -> {
            try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
                String msg;
                while ((msg = console.readLine()) != null) {
                    out.println(msg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        readThread.start();
        writeThread.start();
    }
}
