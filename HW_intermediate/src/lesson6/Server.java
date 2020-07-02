package lesson6;
        import java.io.*;
        import java.net.ServerSocket;
        import java.net.Socket;

public class Server {

    private static final int SERVER_PORT = 8070;

    public static void main(String[] args) {
        new Server().startServer();
    }

    public synchronized void startServer() {

        Socket socket = null;

        try(ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Сервер запущен");
            socket = serverSocket.accept();
            System.out.println("Пользователь подключился к порту номер : " + SERVER_PORT);
            System.out.println("Напишите сообщение:");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            new Thread(new Runnable() {

                @Override

                public void run() {

                    try {
                        while (true) {

                            String message = reader.readLine();
                            out.writeUTF(message);
                        }

                    } catch (IOException exc) {
                        System.out.println("Сервер остановлен");
                    }
                }
            }).start();

            while (true) {

                String message = in.readUTF();
                if (message.equals("Завершить")) {
                    System.out.println("Пользователь вышел");
                    break;
                }
                System.out.println("Пользователь написал:  " + message);
            }

        } catch (IOException exc) {
            System.out.println("Конец соединения");
        } finally {
            try {
                socket.close();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}