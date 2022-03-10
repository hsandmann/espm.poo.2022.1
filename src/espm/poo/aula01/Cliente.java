package espm.poo.aula01;

import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws Exception {

        Socket cliente = new Socket("127.0.0.1",3030);
        cliente.getOutputStream().write(args[0].getBytes());
        cliente.close();


    }
    
}
