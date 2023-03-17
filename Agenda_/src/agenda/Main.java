package agenda;

import java.util.Scanner;

public class Main {
//	Tendremos una clase Persona.
//	Nuestra Agenda será una Clase , que como atributo tendrá la lista todas las personas incluidas en mi
//	Agenda. Podremos realizar las siguientes operaciones.
//	• Añadir persona
//	• Borrar persona
//	• Buscar persona
//	• Mostras la lista de todas las personas
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		while(true) {
			System.out.print("introduce a name: ");
			String name = scan.nextLine();
			System.out.print("Introduce the phone number: ");
			Integer telef = scan.nextInt();
			agenda.add(new Persona(name, telef));
			
			scan.nextLine();
			System.out.println("Introduce n para salir: ");
			
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		for(Persona p: agenda.agenda) {
			System.out.println(p);
			System.out.println("---");
		}
		
//		agenda.search("poasa");
//		agenda.remove("poasa");
//		scan.close();
//		ConcurrentHashMap<String, String> map;
//		map = new ConcurrentHashMap<>();
		scan.close();
	}
	
//	The interrogation mark (?) in Java is used as part of the ternary operator, which is a shorthand way of writing 
//	an if-else statement. The ternary operator has the following syntax:
// 	int x = condition ? expression1 : expression2
//	int x = a > b ? a : b; "IF a > b --> (True x = expression1 ), (False x = expression2)"
}
