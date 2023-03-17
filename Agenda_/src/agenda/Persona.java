package agenda;

public class Persona {
//	Tendremos una clase Persona.
//	Nuestra Agenda será una Clase , que como atributo tendrá la lista todas las personas incluidas en mi Agenda. 
//	Podremos realizar las siguientes operaciones.
//	• Añadir persona
//	• Borrar persona
//	• Buscar persona
//	• Mostras la lista de todas las personas
	
	protected String nombre;
	protected Integer telefono;
	protected String key;
	
	public Persona() {
		this.nombre = null;
		this.telefono = null;
	}
	
	public Persona( String nombre, Integer telefono) {
	
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public String getKey() {
		return key;
	}
	
	public String getName() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTelef() {
		return telefono;
	}
	public void setTelef(Integer telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {

		return this.getName() + ", " + this.getTelef();
	}
	
}
