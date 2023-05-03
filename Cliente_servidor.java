import java.io.*;
import java.net.*;

class Cliente_servidor extends Thread {

Socket coneccion;
int i,x;
Variable_global global_local;
DataInputStream in;
DataOutputStream out;

  
  public Cliente_servidor (Variable_global global,Socket con,int i){
     this.i =i;
     global_local=global;
     coneccion = con;

  }

  public void run(){
    

        System.out.println("Corriendo hilo :"+i);

        while(true){
        try{
          in= new DataInputStream(coneccion.getInputStream());
          out = new DataOutputStream(coneccion.getOutputStream());
          x= in.readInt();
          System.out.println(x);
          

        }catch(IOException e){
          System.out.println("Error a recibir dato"+e);
        }
        }
        
        
  }

  

}