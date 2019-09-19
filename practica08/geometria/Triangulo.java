package geometria;

/**
 *Representa un polígono de tres lados.
 *Está definido por tres puntos en el plano cartesiano.
 */

public class Triangulo {
    private Punto a;
    private Punto b ;
    private Punto c;

    /**
     *ESQUILATERO -- Triángulo con todos sus lados de la misma longitud.
     *ISOSCELES -- Triángulo con exactamente dos lados de la misma longitud.
     *ESCALENO -- Triángulo con todos sus lados de longitud distinta.
     */

    public static final int EQUILATERO = 0;
    public static final int ISOSCELES = 1;
    public static final int ESCALENO = 2;

    /**
     * Constructor default
     *Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
     */

    public Triangulo () {
	a = new Punto (0,0);
	b = new Punto (1,0);
	c = new Punto (0.5, Math.sin(Math.PI/3));
    }
	    

    /**
     *Constructor con parametros
     *Crea un triángulo con los tres puntos dados.
     *@param Punto a, Punto b, Punto c
     */
    
    public Triangulo (Punto a, Punto b, Punto c) {
	    this.a = a;
	    this.b = b;
	    this.c = c;
    }

    /**
     *Metodo que Determina si los vértices de este triángulo están alineados.
     *@return true si los vertices estan alineados.
     */
    
    public boolean tieneVerticesAlineados (){
	if(this.a.estanAlineados(this.b, this.c)){
	    return true;
	}else {
	    return false;
	}
    }

    /**
     *Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
     *@return el tipo de este triangulo
     */

    public int tipo(){
	if(a.distancia(b) == b.distancia(c) && c.distancia(a) == a.distancia(b)){
	    return EQUILATERO;
	}else if (a.distancia(b) == a.distancia(c) || b.distancia(c) == a.distancia(b) || a.distancia(c) == b.distancia(c)) {
	    return ISOSCELES;
	}else {
	    return ESCALENO;
	}
    }

    /**
     *Regresa el punto a del triangulo
     *@return El punto a
     */

    public Punto getA(){
	return a;
    }

    /**
     *Regresa el punto b del triangulo
     *@return EL punto b
     */
    public Punto getB(){
	return b;
    }

    /**
     *Regresa el punto c del triangulo
     *@return El punto c
     */
    public Punto getC(){
	return c;
    }
}
	
    

    




	    
