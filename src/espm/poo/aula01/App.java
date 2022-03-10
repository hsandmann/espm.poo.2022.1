package espm.poo.aula01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(3030);
        System.out.println("Abriu a porta");
        while (true) {
            final Socket cliente = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try (Scanner entrada = new Scanner(cliente.getInputStream())) {
                        String recebido = entrada.nextLine();
                        System.out.println(cliente.getPort() + ": " + recebido);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println("Indo dormir");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Acordei");
                }
            }).start();
        }
//        server.close();
    }

}
