

public class Computadora { //clase madre
	protected String color, precio, procesador, ram, discoDuro, pantalla; 
	protected int noCompu;
	
	public Computadora() {
		color= "negro";
		precio="0";
		procesador="0";
		ram="0";
		discoDuro = "0";
		pantalla ="0" ;
	}
	

	public Computadora(String color, String precio, String procesador,
			String ram, String discoDuro, String pantalla, int noCompu) {
		this.color = color;
		this.precio = precio;
		this.procesador = procesador;
		this.ram = ram;
		this.discoDuro = discoDuro;
		this.pantalla = pantalla;
		this.noCompu = noCompu;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(String discoDuro) {
		this.discoDuro = discoDuro;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public int getNoCompu() {
		return noCompu;
	}

	public void setNoCompu(int noCompu) {
		this.noCompu = noCompu;
	}

	
	public String toString() {
		return "Computadora [color=" + color + ", precio=" + precio
				+ ", procesador=" + procesador + ", ram=" + ram
				+ ", discoDuro=" + discoDuro + ", pantalla=" + pantalla
				+ ", noCompu=" + noCompu + "]";
	}
	
	

}
