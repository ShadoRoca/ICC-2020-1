package ajedrez.piezas;
import java.util.List;
import java.util.LinkedList;
import ajedrez.Tablero;

public class PruebaDama {
  public static void main (String [] pps){

    Tablero tab = Tablero.obtenerInstancia();

    Pieza p = tab.obtenerPieza(7,3);

    System.out.println(p.obtenerJugadasLegales());
  }
}
