
public class Tablet extends Computadora{
	private String touch, estiloTeclado;
	
	public Tablet(String touch, String estiloTeclado,String color, String precio, String procesador,
			String ram, String discoDuro, String pantalla, int noCompu) {
		super(color, precio, procesador,ram, discoDuro,pantalla,noCompu);
		this.touch=touch;
		this.estiloTeclado=estiloTeclado;
	}

	public String getTouch() {
		return touch;
	}

	public void setTouch(String touch) {
		this.touch = touch;
	}

	public String getEstiloTeclado() {
		return estiloTeclado;
	}

	public void setEstiloTeclado(String estiloTeclado) {
		this.estiloTeclado = estiloTeclado;
	}

	
	public String toString() {
		return "Tablet [touch=" + touch + ", estiloTeclado=" + estiloTeclado
				+ ", color=" + color + ", precio=" + precio + ", procesador="
				+ procesador + ", Ram=" + ram + ", Disco Duro=" + discoDuro
				+ ", pantalla=" + pantalla + ", Codigo de la compu=" + noCompu + "]";
	}
	

	
	
	

}
