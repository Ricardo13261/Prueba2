
public class Vino {
	private String nombre; // se declaran los aributos para el objeto vino
	private String cosecha;
	private String tipo;
	private int disponibilidad_maxima;
	private int disponibilidad_minima;
	private int disponibilidad_real;
	private long valor_ventas;
	
	public Vino () { // se le agregan valores por defecto a los atributos vino
		nombre = "vega sicilia";
		cosecha = "el verano pasado";
		tipo = "tinto";
		disponibilidad_maxima = 32;
		disponibilidad_minima = 25;
		disponibilidad_real = 29;
		valor_ventas = 4560;
	}
	// se comentara el metodo get y set, utilizado para aclarar dudas, con el proposito de mantener el orden, 
	// solo se comentaran dos metodos y el el caso que se realize un cambio
	public void setnombre (String nombre){ //se utiliza el metodo set para ingresar los valores al atributo nombre
		this.nombre= nombre; // se especifica que para este atributo nombre se le agregara este valor string 
	}
	
	public String getnombre(){
		return nombre;
	}
	
	public void setcosecha(String cosecha){
		this.cosecha=cosecha;
	}
	
	public String getcosecha() {
		return cosecha;
	}
	
	public void settipo(String tipo){
		this.tipo=tipo;
	}
	
	public String gettipo(){
		return tipo;
	}
	
	public void setdisponibilidad_maxima(int disponibilidad_maxima){ // se cambio String por un int, ya el el dato sera numerico
		this.disponibilidad_maxima = disponibilidad_maxima;
	}
	
	public int getdisponibilidad_maxima(){
		return disponibilidad_maxima;
	}
	
	public void setdisponibilidad_minima(int disponibilidad_minima){
		this.disponibilidad_minima= disponibilidad_minima;
	}
	
	public int getdisponibilidad_minima(){
		return disponibilidad_minima;
	}
	
	public void setdisponibilidad_real(int disponibilidad_real){
		this.disponibilidad_real=disponibilidad_real;
	}
	
	public int getdisponibilidad_real(){
		return disponibilidad_real;
	}
	
	public void setvalor_ventas(long valor_ventas){ // se cambio el int por un long que sirve para ingresar datos muy grandes de tipo numerico
		this.valor_ventas=valor_ventas;
	}
	
	public long getvalor_ventas(){
		return valor_ventas;
	}
	
	public String toString (){
		String datos = "";
		datos= datos + " "+ "nombre:  "+ nombre + "\n" + "cosecha:  "+ cosecha; 
		datos= datos + "tipo  "+ tipo + "\n"+ "disponibilidad_maxima  "+ disponibilidad_maxima;
		datos= datos + "disponibilidad_minima  " + disponibilidad_minima+ "\n"+ "disponibilidad_real"+ disponibilidad_real;
		datos= datos + "valor_ventas   "+ valor_ventas; 
		return datos;
	}
	
}
