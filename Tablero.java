import java.io.*;

public class Tablero implements Serializable {
 int [][] tablero;
 public int x;
 public int y;

public void agregar_barcos(int [][] barco){
    
}

public void dimensiones_tablero(int xx, int yy){

   x=xx;
   y=yy;

  tablero= new int[ x ][ y ];

  for (int i=0 ;i< x ;i++ ) {
   for (int j=0;j< y ;j++ ) {
      tablero[i][j] = 0;
   }
     
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