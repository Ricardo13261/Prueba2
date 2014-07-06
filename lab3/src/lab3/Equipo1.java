package lab3;

public class Equipo1 {
	private int goles;                  // se declaran los nuevos atributos
	private Sancion sanciones;           // se declara el atributo de tipo Sancion "la clase" y nombre sanciones
	private String gano;
	
	public Equipo1 (){                    // se le asignan valores por defecto a los atributos 
		goles=5;
		gano = "si" ;
		sanciones = new Sancion ();        //se crea una nueva sancion, que se llamara sanciones
	}
	
	public Equipo1 ( int goles, String gano, Sancion sanciones){          // se espesifican que estos goles de llamaran goles, por medio de this
		this.goles = goles;
		this.gano = gano;
		this.sanciones = sanciones;
	}
	
	public void setgoles( int goles){         // se realizan los get y set para cada atributo, set=asignar valores  y get = dar valores 
		this.goles=goles;       // el atributo goles recibira el valor de goles, puede ser 3 goles por ejemplo
	}
	
	public int getgoles (){
		return goles;
	}
	
	public void setgano( String gano){
		this.gano = gano;
	}
	
	public String getgano () {
		return gano;
	}

	public void setsanciones ( Sancion sanciones){           //canciones seran de tipo Sancion, que es la clase que contiene los valores
		this.sanciones = sanciones;
	}
	
	public Sancion getsanciones (){
		return sanciones;
	}
	
	public String toString (){         // el metodo toString, para concatenar y debolver los valores
		String total = "goles anotados: " + goles + "\n" + "¿este equipo gano?  " + gano + "\n" + "Sanciones marcadas por el arbitro:  " + sanciones; 	
		return total;
	}
	
}
