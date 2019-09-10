/**
 * Clase libro
 * @author Liprandi Cortes Rodrigo
 *@version 1.0
 */

public class Libro {
    
    //Declaracion de variables
    String titulo;
    String autor;
    int anioPublicacion;
    

     /**
     * Constructor default.
     */
    public Libro(){
	titulo = "";
	autor = "";
	anioPublicacion = 0;
    }

    /**
     * Constructor con parametros
     * @param titulo autor anioPublicacion
     */
   public Libro(String nuevoTitulo, String nuevoAutor, int nuevoAnioPublicacion){
	titulo = nuevoTitulo;
	autor = nuevoAutor;
	anioPublicacion = nuevoAnioPublicacion;
    }

    /**
     * Regresa el titulo
     *@return titulo
     */
    public String getTitulo(){
	return titulo;
    }

    /**
     * Asigna un nuevo titulo
     * @param titulo el nuevo titulo
     */

    public void setTitulo(String titulo ){
	this.titulo = titulo;
    }

    /**
     * Regresa el autor
     * @return el autor
     */

    public String getAutor(){
	return autor;
    }

    /**
     * Asigna un nuevo autor
     * @param autor el nuevo autor
     */

    public void setAutor(String autor){
	this.autor = autor;
    }


    /**
     * Regresa el año de publicacion
     * @return el año de publicacion
     */
    
    public int getAnioPublicacion(){
	return anioPublicacion;
    }

    /**
     * Asigna un nuevo año de publicacion
     * @param año de publicacion el nuevo año de publicacion
     */
    public void setAnioPublicacion(int anioPublicacion){
	this.anioPublicacion = anioPublicacion;
    }




}
	    

    





