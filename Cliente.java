import java.io.*;
import java.util.Scanner;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente{

	public static void main (String[] args){

	  final String host = "192.168.88.101";

      final int puerto = 2000;

      int id=0;

      int barco_x;
      int barco_y;

      DataInputStream in;
      DataOutputStream out_data;
      ObjectOutputStream out;

      Tablero tab = new Tablero(300,300);

      Scanner scan = new Scanner(System.in);

	try {

          Socket sc = new Socket(host, puerto);
 
          in = new DataInputStream(sc.getInputStream());
          out_data = new DataOutputStream(sc.getOutputStream());
          out = new ObjectOutputStream(sc.getOutputStream());

          //codigo ejecutandoces

          System.out.println("Ingrese las cordenadas de su barco 300x300 ");
          System.out.println("Tiene barcos de dimensiones 20x20 ");

          for (int i=0;i<4 ; i++ ) {

             System.out.println("Ingrese cordenada x ");
             barco_x=scan.nextInt();
             System.out.println("Ingrese cordenada y");
             barco_y=scan.nextInt();
             
             if(tab.agregar_barcos(barco_x,barco_y) == false){
               i--;
             }else{
               System.out.println("Se agrego el barco");
               tab.imprimir_tablero();
             }

          }
          

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