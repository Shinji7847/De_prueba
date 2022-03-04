package open_bootcamp;

/*  Crear clase Persona.
- Crear variables las privadas edad, nombre y telefono de la clase Persona.
- Crear gets y sets de cada propiedad.
- Crear un objeto persona en el main.
- Utiliza los gets y sets para darle valores a las propiedades edad, 
nombre y telefono, por último **muéstralas por consola**. */

import java.util.*;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		
		persona1.setNombre("Juan");
		
		System.out.println("El nombre de la persona1 es: " + persona1.getNombre());
		
		persona1.setEdad(25);
		
		System.out.println("La edad de la persona1 es: " + persona1.getEdad() + " años");
		
		persona1.setTelefono("+911245232542");
		
		System.out.println("El número telefonico de la persona1 es: " + persona1.getTelefono());
	}
	
	private String nombre;
	
	private int edad;
	
	private String num_telefonico;
	
	
	//Setter
	public void setNombre(String nombre) { 
		 
		this.nombre = nombre;
		
	}
	
	//Getter
	public String getNombre() { 
		
		return nombre;

	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
		
		
	}
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public void setTelefono(String num_telefonico) {
		
		this.num_telefonico = num_telefonico;
	
	}
	
	public String getTelefono() {
		
		return num_telefonico;
		
	}
}