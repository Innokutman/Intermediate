package lesson6;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    private static final String SERVER_ADDR = "localhost";

    private static final int SERVER_PORT = 8070;

    public static void main(String[] args) {

        new Client().startClient();
    }

    public synchronized void startClient() {

        try (Socket socket = new Socket(SERVER_ADDR, SERVER_PORT)) {

            System.out.println("Вы вошли на сервер " + SERVER_ADDR);
            System.out.println("Напищите сообщение: ");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String message = in.readUTF();
                            if (message.equals("Завершить")) {
                                System.out.println("Сервер отключён");
                                socket.close();
                                break;
                            }
                            System.out.println("Ответ сервера: " + message);
                        }
                    } catch (IOException exc) {
                        System.out.println("Конец соединения");
                    }
                }
            }).start();

            while (true) {
                String message = reader.readLine();
                out.writeUTF(message);
            }

        } catch (IOException exc) {
            System.out.println("Сервер не подключён");
        }
    }
}
