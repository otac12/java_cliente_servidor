import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente{

	public static void main (String[] args){

	  final String host = "10.104.109.241";

      final int puerto = 2000;

      String accion= "";

      DataInputStream in;
      ObjectOutputStream out;

      Tablero tab = new Tablero();
      tab.dimensiones_tablero(300,300);

	try {

          Socket sc = new Socket(host, puerto);
 
          in = new DataInputStream(sc.getInputStream());
          out = new ObjectOutputStream(sc.getOutputStream());
          
          out.writeObject(tab);

          String mensaje = in.readUTF();
         
          System.out.println(mensaje);

         System.out.println("termino de sesion");

         sc.close();

		}catch(IOException ex){
           
          Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
		}

	}



}