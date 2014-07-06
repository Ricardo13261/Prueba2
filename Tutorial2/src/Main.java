
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vino vino= new Vino(); // se creo una variable llamada vino
		System.out.println ("Nombre del vino:   " + vino.getnombre()); // se imprimen los valores por defecto que posee cada atributo
		System.out.println ("Nombre de la cosecha  "+vino.getcosecha());
		System.out.println ("Tipo de vino  "+vino.gettipo());
		System.out.println ("La disponibilidad maxima de vino es: "+vino.getdisponibilidad_maxima());
		System.out.println ("la disponibilidad minima del vino es: "+vino.getdisponibilidad_minima());
		System.out.println ("la disponibilidad real del vino es:  "+vino.getdisponibilidad_real());
		System.out.println ("el promedio del ventas obtenidas en 30 dias  "+vino.getvalor_ventas());
		// se cambia el valor de nombre que tenia con el metodo set, que ingresa
		vino.setnombre("Florentino");
		// trae el valor nuevo del nombre con el metodo get
		System.out.println ("Nombre del vino:   " +vino.getnombre()); // logrando un nuevo objeto, con diferentes atributos
		vino.setcosecha(" otoño de 1894");
		System.out.println ("Nombre de la cosecha  "+vino.getcosecha());
		vino.settipo("blanco");
		System.out.println ("Tipo de vino  "+vino.gettipo());
		vino.setdisponibilidad_maxima(478);
		System.out.println ("La disponibilidad maxima de vino es: "+vino.getdisponibilidad_maxima());
		vino.setdisponibilidad_minima(320);
		System.out.println ("la disponibilidad minima del vino es: "+vino.getdisponibilidad_minima());		
		vino.setdisponibilidad_real(390);
		System.out.println ("la disponibilidad real del vino es:  "+vino.getdisponibilidad_real());
		vino.setvalor_ventas(2346);
		System.out.println ("la disponibilidad real del vino es:  "+vino.getvalor_ventas());
		
		
	}

}
