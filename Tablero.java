import java.io.*;

public class Tablero implements Serializable {
 int [][] tablero;
 public int x;
 public int y;
 public int total_sub;

 public Tablero(int xx, int yy,int sub){
   total_sub=sub;
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

   if(0>barco_x || 0>barco_y || 10<barco_y ||10<barco_x ){
        System.out.println("fuera del tablero");
        existe=false;
    }else{
         
         if(tablero[barco_x][barco_y]==1){

            existe=false;
         
         }

    }

if (existe==true) {
       
         tablero[barco_x-1][barco_y-1]=1;

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

public boolean localizacion (int [] tiro){
      
      boolean acerto=true;
      for (int i=0;i<10 ; i++) {
         for (int j=0;j<10 ;j++ ) {
     
          if(tablero[tiro[0]][tiro[1]]==1){
              acerto=false;
           }
          }
      }
      return acerto;
  }

}