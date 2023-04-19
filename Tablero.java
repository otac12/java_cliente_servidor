public class Tablero{
private int [][] tablero;
private int x;
private int y;

public void agregar_barcos(int [][] barco){
    
}

public void dimensiones_tablero(int xx, int yy){

   x=xx;
   y=yy;
  tablero= new int[ x ][ y ];

  for (int i=0 ;i< x ;i++ ) {
   for (int j=0;i< y ;j++ ) {
      tablero[x][y] = 0;
   }
     
  }

}

public void imprimir_tablero(){
  for (int i=0 ;i<x;i++ ) {
   for (int j=0;i<y ;j++ ) {
      System.out.print(tablero[x][y]);
   }
    System.out.println(" ");
     
  }

}

}