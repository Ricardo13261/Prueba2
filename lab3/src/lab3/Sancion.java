package lab3;

public class Sancion {
	private int tarjetas_rojas;  // se declaran los atributos de Sancion
	private int tarjetas_amarillas;
	private int tiros_a_gol;
	private int faltas;
	private int tiros_de_esquina;
	
	public Sancion(){     // se le asignan valores por defecto a estos atributos
		tarjetas_rojas = 1;
		tarjetas_amarillas= 5;
		tiros_a_gol= 12;
		faltas= 15;
		tiros_de_esquina= 8;
	
	}
	
	public Sancion(int tarjetas_rojas, int tarjetas_amarillas, int tiros_a_gol,int faltas, int tiros_de_esquina ){  // las lineas largas no las dividi, devido que java me tiraba error.
		this.tarjetas_rojas = tarjetas_rojas;                      // se le dice a java, que el valor de el atributo tarjetas_rojas se guardara en Tarjetas_rojas
		this.tarjetas_amarillas= tarjetas_amarillas;
		this.tiros_a_gol = tiros_a_gol;
		this.faltas=faltas;
		this.tiros_de_esquina=tiros_de_esquina;
	}
	
	public void settarjetas_rojas ( int tarjetas_rojas){   // se declaran los set y get para cada atributo de esta clase
		this.tarjetas_rojas = tarjetas_rojas;
	}
	
	public int gettarjetas_rojas(){
			return tarjetas_rojas;  // el return regresa el valor ingresado por el set
	}
	
	public void settarjetas_amarillas(int tarjetas_amarillas){
		this.tarjetas_amarillas = tarjetas_amarillas;
	}
	public int gettarjetas_amarillas(){
			return tarjetas_amarillas;
	}
	
	public void settiros_a_gol(int tiros_a_gol){
		this.tiros_a_gol = tiros_a_gol;
	}	
	public int gettiros_a_gol(){
			return tiros_a_gol;
	}
	
	public void setfaltas(int faltas){
		this.faltas = faltas;
	}
	public int getfaltas(){
			return faltas;
	}
			
	public void settiros_de_esquina(int tiros_de_esquina){
		this.tiros_de_esquina = tiros_de_esquina;
			
	}
	
	public String toString (){ //con el metodo toString se concatenan todos los atributos y se devuelve a la clase principal, pasando por la clase Equipo1
	String totales = "\n" +"tarjetas_amarillas: " + tarjetas_amarillas + "\n" + "tarjetas_rojas:  " + tarjetas_rojas + "\n" + "tiros de esquina: " + tiros_de_esquina + "\n" +"faltas cometidas" + faltas + "\n" +"tiros a gol" + tiros_a_gol; 	
	return totales;
	}
	
	
}
