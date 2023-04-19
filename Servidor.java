import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor{

public static void main(String [] args){

	ServerSocket servidor =null;
	Socket sc= null;
    DataInputStream in;
    DataOutputStream out;
	final int Port = 2000;


	try {
      
      servidor =new ServerSocket(Port,300);

      System.out.println("Servidor iniciado");
      
      while(true){

        sc = servidor.accept();
        System.out.println("Un cliente se a conectado");
        in = new DataInputStream(sc.getInputStream());
        out = new DataOutputStream(sc.getOutputStream());

        String mensaje = in.readUTF();

        System.out.println(mensaje);

        out.writeUTF("holaa");

        sc.close();
        System.out.println("desconectado");
      }
       
	}catch(IOException ex){
        Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE,null,ex);
	}

	}
}