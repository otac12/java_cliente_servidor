import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.*;


public class Servidor{
    public static void main (String [] arg){
    	int x,y,i;
    	String mensaje;
    	int puerto=2000;
        Cliente_servidor [] hilos = new Cliente_servidor [2];
        Socket [] cliente = new Socket[2];
        ServerSocket server;

    	x=300;
    	y=300;
        i=0;

        Variable_global global = new Variable_global(x,y);
        
        while(true){
           
           //if (){
           	try {
            server = new ServerSocket(puerto + i);
            cliente[i] = server.accept();
            System.out.println("Se conecto un cliente");

            hilos[i] = new Cliente_servidor(global,cliente[i],i);
            hilos[i].start();

           i++;
           }catch(IOException e){
             System.out.println("error a iniciar conección");
          // }
         }
           
            
        }

      
    }
    
}