package paquete;
import processing.core.PApplet;
/*javac -classpath lib/core.jar -d build src/paquete/Tablero.java && java -classpath build:lib/core.jar paquete.Tablero*/

/**
*
*Clase que genera un tablero de ajedrez
*en funcion al tamanio de la pantalla
*@author Liprandi Cortes Rodrigo
*
**/

public class Tablero extends PApplet {
  public static void main(String[] args) {
    PApplet.main("paquete.Tablero");
  }

  @Override
  public void settings() {
    /*Pantalla completa*/

    fullScreen();
  }

  @Override
  public void setup() {
  }

  @Override
  public void draw() {

    background( 39, 68, 10 );

    /*Encuentra el ancho y alto de la pantalla*/

    int altura = displayHeight;
    int ancho = displayWidth;

    for(int e = 0, y = altura/12; e<8; y+=altura/12, e++){
      for(int i = 0, x = (ancho*5/16); i<8; i++, x+=altura/12){
        if(e%2!=0){
          if(i%2==0){
            fill(204,146,112);
            rect(x,y,altura/12,altura/12);
          }
          else{
            fill(82,46,25);
            rect(x,y,altura/12,altura/12);
          }
        }
        else{
          if(i%2==0){
            fill(82,46,25);
            rect(x,y,altura/12,altura/12);
          }
          else{
            fill( 204, 146, 112  );
            rect(x,y,altura/12,altura/12);
          }
        }

      }
    }
  }
}
