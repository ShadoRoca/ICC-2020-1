package ajedrez.piezas;
import java.util.List;
import java.util.LinkedList;


public class PruebaPeon{
  public static void main(String [] pps){

    Posicion pos1 = new Posicion(1,7);
    Posicion pos2 = new Posicion(6,0);
    Posicion pos3 = new Posicion(7,5);
    Posicion pos4 = new Posicion(0,6);
    Posicion pos5 = new Posicion(3,4);
    Posicion pos6 = new Posicion(1,2);

    Peon p1 = new Peon(Color.NEGRO,pos1);
    Peon p2 = new Peon (Color.BLANCO,pos2);
    Peon p3 = new Peon (Color.NEGRO,pos3);
    Peon p4 = new Peon (Color.BLANCO, pos4);
    Peon p5 = new Peon(Color.NEGRO,pos5);
    Peon p6 = new Peon(Color.NEGRO,pos6);

    System.out.println("El peon p1 de color negro esta en la posicion " + pos1 + "\n" + "Y se puede mover a: " + p1.obtenerJugadasLegales() +"\n");
    System.out.println("El peon p2 de color blanco esta en la posicion " + pos2 + "\n" + "Y se puede mover a: " + p2.obtenerJugadasLegales() +"\n");
    System.out.println("El peon p3 de color negro esta en la posicion " + pos3 + "\n" + "Y se puede mover a: " + p3.obtenerJugadasLegales() + "\n");
    System.out.println("El peon p4 de color blanco esta en la posicion " + pos4 + "\n" + "Y se puede mover a: " + p4.obtenerJugadasLegales() + "\n");
    System.out.println("El peon p5 de color negro esta en la posicion " + pos5 + "\n" + "Y se puede mover a: " + p5.obtenerJugadasLegales() + "\n");
    System.out.println("El peon p6 de color negro esta en la posicion " + pos6 + "\n" + "Y se puede mover a: " + p6.obtenerJugadasLegales() + "\n");

  }
}
