package ru.gordeev.homeworks.homework13.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int port;
    private DataInputStream in;
    private DataOutputStream out;


    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try (ServerSocket socket = new ServerSocket(port)) {
            System.out.printf("Server has been started at port %d\n", port);
            Socket clientSocket = socket.accept();
            while (true) {
                in = new DataInputStream(clientSocket.getInputStream());
                out = new DataOutputStream(clientSocket.getOutputStream());

                out.writeUTF("Available operations, select the one you want: *, /, +, -");
                String operation = in.readUTF();
                int firstNumber = 0;
                int secondNumber = 0;
                try {
                    out.writeUTF("Now enter first number: ");
                    firstNumber = Integer.parseInt(in.readUTF());
                    out.writeUTF("Now enter second number: ");
                    secondNumber = Integer.parseInt(in.readUTF());
                } catch (NumberFormatException e) {
                    out.writeUTF("Only numbers are allowed");
                    continue;
                }
                calculations(operation, firstNumber, secondNumber);

                out.writeUTF("One more (press Enter) or /exit?");
                String answer = in.readUTF();
                if (answer.equals("/exit")) {
                    disconnect();
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to connect user");
        }
    }

    private void calculations(String operation, int firstNumber, int secondNumber) throws IOException {
        switch (operation) {
            case "+":
                out.writeUTF("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                out.writeUTF("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                out.writeUTF("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    out.writeUTF("Division by zero is forbidden!");
                    break;
                }
                out.writeUTF("Result: " + (firstNumber / secondNumber));
                break;
            default:
                out.writeUTF("Unsupported operation");
        }
    }

    private void disconnect() throws IOException {
        if (in != null) {
            in.close();
        }

        if (out != null) {
            out.close();
        }
    }
}
