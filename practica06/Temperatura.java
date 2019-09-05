public class Temperatura{
    public static int CELSIUS = 2;
    public static int FAHRENHEIT = 1;
    double valor;
    int escala;

    /*Temperatura t = new Temperatura(30,Temperatura.CELSIUS);*/

    public Temperatura(double valor, int escala){
	this.valor = valor;
	this.escala = escala;
    }

    public double convertirACelsius(double valorf){
	return (valorf - 32)/1.8;
    }
    public double convertirAFahrenheit(double valorc){
	return valorc * 1.8 +32;
    }
    public double obtenerTemperaturaenCelsius(){
	if(escala == CELSIUS){
	    return valor;
	} else {
	    return convertirACelsius(valor);
	}
    }
    public double obtenerTemperaturaenFahrenheit(){
	if(escala == FAHRENHEIT){
	    return valor;
	} else {
	    return convertirAFahrenheit(valor);
	}
    }
    public boolean esIgual (Temperatura temp){
	if(escala == temp.escala
	   && valor == temp.valor){
	    return true;
	} else{
	    return false;
	}
    }
    public boolean esMayor (Temperatura temp){
	return obtenerTemperaturaenCelsius() > temp.obtenerTemperaturaenCelsius();
    }
    public boolean esMenor (Temperatura temp){
	return obtenerTemperaturaenCelsius() < temp.obtenerTemperaturaenCelsius();
    }
}

    

	    
	     
