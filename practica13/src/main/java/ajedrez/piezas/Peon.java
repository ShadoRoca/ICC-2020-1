package ajedrez.piezas;
import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {
  public Peon(Color color, Posicion posicion) {
    super(color, posicion);
  }

  @Override
  public List<Posicion> obtenerJugadasLegales() {
    LinkedList<Posicion> jugadas = new LinkedList <>();
    int fila = obtenerPosicion().obtenerFila(),
        columna = obtenerPosicion().obtenerColumna();

      if (obtenerColor() == Color.BLANCO) {
        if (fila == 6 && columna == 0){
          jugadas.add(new Posicion(fila-2,columna));
          jugadas.add(new Posicion(fila-1,columna));
          jugadas.add(new Posicion(fila-1,columna+1));
        }
        if (fila == 6 && columna == 7) {
          jugadas.add(new Posicion(fila-2,columna));
          jugadas.add(new Posicion(fila-1,columna));
          jugadas.add(new Posicion(fila-1,columna-1));
        }
        if (fila == 6 && columna != 0 && columna != 7) {
          jugadas.add(new Posicion(fila-2,columna));
          jugadas.add(new Posicion(fila-1,columna+1));
          jugadas.add(new Posicion(fila-1,columna-1));
          jugadas.add(new Posicion(fila-1,columna));
        }
        if (fila+1 <= 6 && fila-1 >= 0 && columna != 0 && columna != 7) {
          jugadas.add(new Posicion(fila-1,columna));
          jugadas.add(new Posicion(fila-1,columna+1));
          jugadas.add(new Posicion(fila-1,columna-1));
        }
        if (fila+1 <= 6 && fila-1 >= 0 && columna == 0) {
          jugadas.add(new Posicion(fila-1,columna));
          jugadas.add(new Posicion(fila-1,columna+1));
        }
        if (fila+1 <= 6 && fila-1 >= 0 && columna == 7) {
          jugadas.add(new Posicion(fila-1,columna));
          jugadas.add(new Posicion(fila-1,columna-1));
        }
      }
      if (obtenerColor() == Color.NEGRO) {
        if (fila == 1 && columna == 0){
          jugadas.add(new Posicion(fila+2,columna));
          jugadas.add(new Posicion(fila+1,columna));
          jugadas.add(new Posicion(fila+1,columna+1));
        }
        if (fila == 1 && columna == 7) {
          jugadas.add(new Posicion(fila+2,columna));
          jugadas.add(new Posicion(fila+1,columna));
          jugadas.add(new Posicion(fila+1,columna-1));
        }
        if (fila == 1 && columna != 0 && columna != 7) {
          jugadas.add(new Posicion(fila+2,columna));
          jugadas.add(new Posicion(fila+1,columna+1));
          jugadas.add(new Posicion(fila+1,columna-1));
          jugadas.add(new Posicion(fila+1,columna));
        }
        if (fila-1 >= 1 && fila+1 <= 7 && columna !=0 && columna !=7) {
          jugadas.add(new Posicion(fila+1,columna));
          jugadas.add(new Posicion(fila+1,columna+1));
          jugadas.add(new Posicion(fila+1,columna-1));
        }
        if (fila-1 >= 1 && fila+1 <= 7 && columna == 0) {
          jugadas.add(new Posicion(fila+1,columna));
          jugadas.add(new Posicion(fila+1,columna+1));
        }
        if (fila-1 >= 1 && fila+1 <= 7 && columna == 7) {
          jugadas.add(new Posicion(fila+1,columna));
          jugadas.add(new Posicion(fila+1,columna-1));
        }
      }
    return jugadas;
  }
}
