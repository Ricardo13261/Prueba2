package lab3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo1 equipo = new Equipo1(); //        Se crea el objeto equipo que tendra los valores de las clases Equipo1 y sancion
		System.out.println("ESPN    ESPN     ESPN   ESPN        ESPN      ESPN        ESPN          ESPN" + "\n"); // se muestra una barra ESPN para mejorar la apariencia
		System.out.println("          .: Estadistica de la semana:.    " + "\n"); // un mensaje amigable al usuario
		System.out.println("        Equipo : Real Madrid! "); // el equipo del que se esta ablando
		System.out.println(equipo)	; // se muestran los valores del equipo, es decir los atributos de la clase Equipo1 y Sancion
		System.out.println( "\n" +"ESPN    ESPN     ESPN   ESPN        ESPN      ESPN        ESPN         ESPN");
		
		System.out.println( "\n" +"ESPN    ESPN     ESPN   ESPN        ESPN      ESPN        ESPN         ESPN" + "\n");
		System.out.println("         Equipo: Manchester city! "); // se muestran los datos de un nuevo equipo
		equipo.setgoles( 2); // se le asignan nuevos valores a los atributos ya existente en las clases Equipo1 y Sancion
		equipo.setgano(" no :(");
		System.out.println(equipo)	; // se imprimen los valores nuevos de las clases Equipo1 y Sancion
		System.out.println( "\n" +"ESPN    ESPN     ESPN   ESPN        ESPN      ESPN        ESPN         ESPN");  // barra ESPN de estilo
	
	}

}
