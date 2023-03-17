package agenda;

public class Agenda {
//	Tendremos una clase Persona.
//	Nuestra Agenda será una Clase , que como atributo tendrá la lista todas las personas incluidas en mi
//	Agenda. Podremos realizar las siguientes operaciones.
//	• Añadir persona
//	• Borrar persona
//	• Buscar persona
//	• Mostras la lista de todas las personas
	
	protected int size;
	protected int minSize;
	protected Persona[] agenda;
	
    public Agenda() {
    	this.minSize = 11;
        this.size = 0;
        this.agenda = new Persona[minSize];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31 * hash + key.charAt(i)) % this.minSize;
        }
        System.out.println(hash);
        return hash;
    }

    public void add(Persona person, int size) {
    	this.size ++;
    	if(size == agenda.length/2) {
    	    Persona[] newAgenda = new Persona[minSize * 2];
    	    for (int i = 0; i < agenda.length; i++) {
    	        newAgenda[i] = agenda[i];
    	    }
    	    agenda = newAgenda;
    		this.minSize = minSize*2;
    	}
//    	System.out.println(size);

        int index = hash(person.getName());
        this.agenda[index] = person;
    }
    public void add(Persona pers) {
    	add(pers, this.size);
    }
    
    public void search(String name) {
    	int index = hash(name);
    	String message= agenda[index] == null ?  "not found"
    			:agenda[index].toString();
    	
    	System.out.println(message);
    }
    public void remove(String name) {
    	int index = hash(name);
//    	agenda[index] = agenda[index].getName().equals(name) ? null
//    			: ;
    	
    	if(agenda[index] != null && agenda[index].getName().equals(name)) {
    		agenda[index] = null;
    		System.out.println(name +" removed from the list");
    	}else {
    		System.out.println("not found");
    	}
    }
    public void mensaje() {
    	System.out.println();
    }
}
