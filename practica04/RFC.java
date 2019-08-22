import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto = new String();
		String fechaNacimiento = new String();
		String nombre, aPaterno, aMaterno, paternoDos, maternoUno,nombreUno, dia, mes, año;

		System.out.println("Introduce tu nombre completo en mayúsculas");

		nombreCompleto = scanner.nextLine();
		nombreCompleto = nombreCompleto.trim();

		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aa");
		fechaNacimiento = scanner.nextLine();
		fechaNacimiento = fechaNacimiento.trim();
		
		int posicion = nombreCompleto.indexOf(" ");

		nombre = nombreCompleto.substring(0,posicion);
		nombreCompleto = nombreCompleto.substring(posicion+1,nombreCompleto.length());

		posicion = nombreCompleto.indexOf(" ");
		aPaterno = nombreCompleto.substring(0,posicion);
		nombreCompleto = nombreCompleto.substring(posicion+1);

		aMaterno = nombreCompleto;

		paternoDos = aPaterno.substring(0,2);
		maternoUno = aMaterno.substring(0,1);
		nombreUno = nombre.substring(0,1);

		int position = fechaNacimiento.indexOf("/");

		dia = fechaNacimiento.substring(0,position);
		fechaNacimiento= fechaNacimiento.substring(position+1,fechaNacimiento.length());
		position = fechaNacimiento.indexOf("/");
		mes = fechaNacimiento.substring(0,position);
		fechaNacimiento = fechaNacimiento.substring(position+1);
		año = fechaNacimiento;

		System.out.println("Tu RFC es ("+paternoDos+maternoUno+nombreUno+dia+mes+año+")");                         
		    
		    
		
		    
		    
		    
		    

		

		

		
		    

		

		    
		    
		    
		  
		

      
		    

		
		
	}

}
