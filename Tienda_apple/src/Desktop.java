

public class Desktop extends Computadora{
	private String graficos, wifi;
	//inicializo
	public Desktop(String graficos, String wifi, String color, String precio, String procesador,
			String ram, String discoDuro, String pantalla, int noCompu) {
		super(color, precio, procesador,ram, discoDuro,pantalla,noCompu);
		this.graficos=graficos;
		this.wifi=wifi;
		//declaro y llamo a la madre
	}
//set y get u construcctor, se repite lo mismo en las hijas tablety laptop
	public String getGraficos() {
		return graficos;
	}

	public void setGraficos(String graficos) {
		this.graficos = graficos;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	
	public String toString() {
		return "Desktop [graficos=" + graficos + ", wifi=" + wifi + ", color="
				+ color + ", precio=" + precio + ", procesador=" + procesador
				+ ", ram=" + ram + ", Disco Duro=" + discoDuro + ", pantalla="
				+ pantalla + ", codigo de compu=" + noCompu + "]";
	}

	

}
