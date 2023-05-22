import java.io.*;

public class Tablero implements Serializable {
 int [][] tablero;
 public int x;
 public int y;

 public Tablero(int xx, int yy){

   x=xx;
   y=yy;

  tablero = new int[ x ][ y ];

  for (int i=0 ;i< x ;i++ ) {
   for (int j=0;j< y ;j++ ) {
      tablero[i][j] = 0;

   }
     
  }

}

public boolean agregar_barcos(int barco_x,int barco_y){

   boolean existe=true;

   for (int i=barco_x - 10; i < barco_x + 10; i++ ) {

      for (int j=barco_y - 10; j < barco_y + 10; j++ ) {
         
         if(tablero[i][j]==1){

            existe=false;
            break;
         }

      }
      
   }

if (existe==true) {

     for (int i=barco_x - 10; i < barco_x + 10; i++ ) {

      for (int j=barco_y - 10; j < barco_y + 10; j++ ) {
         
         tablero[i][j]=1;

      }
      
   }

   return true;
}else{
   System.out.println("Ya existe una barco");
   return false;
}

}



public void imprimir_tablero(){

  for (int i=0 ;i<x;i++ ) {
   for (int j=0;j<y ;j++ ) {
      System.out.print(tablero[i][j]);
   }
    System.out.println(" ");
     
  }

}

}