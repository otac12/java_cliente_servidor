import java.io.*;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente_2{

	public static void main (String[] args){

	  final String host = "10.104.116.185";

      final int puerto = 2001;

      int id=0;
      DataInputStream in;
      DataOutputStream out_data;
      ObjectOutputStream out;

      Tablero tab = new Tablero();
      tab.dimensiones_tablero(300,300);

	try {

          Socket sc = new Socket(host, puerto);
 
          in = new DataInputStream(sc.getInputStream());
          out_data = new DataOutputStream(sc.getOutputStream());
          out = new ObjectOutputStream(sc.getOutputStream());
          
          System.out.println(tab.x);
          out_data.writeInt(tab.x);
          //out_data.writeInt(id);
          //out.writeObject(tab);

          String mensaje = in.readUTF();
         
          System.out.println(mensaje);

         System.out.println("termino de sesion");

         sc.close();

		}catch(IOException ex){
           
          Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
		}

	}



}