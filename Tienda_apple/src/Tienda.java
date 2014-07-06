

//clae encargada de agregar
public class Tienda {
	private Computadora[] compu;

	public Computadora[] getCompu() {
		return compu;
	}

	public void setCompu(Computadora[] compu) {
		this.compu = compu;
	}

	private int cant;

	public Tienda() {
		compu=new Computadora[1000];
		cant=0;
	}
	
	public void adicionarTablet(String graficos, String wifi, String color, String precio, String procesador,
			String ram, String discoDuro, String pantalla, int noCompu){
		Tablet p1=new Tablet(graficos, wifi,color, precio, procesador,ram, discoDuro,pantalla,noCompu);
		compu[cant]=p1;
		cant++;
	}
	
	public void adicionarDesktop(String graficos, String wifi, String color, String precio, String procesador,
			String ram, String discoDuro, String pantalla, int noCompu){
		Desktop p2=new Desktop(graficos, wifi, color, precio, procesador,ram, discoDuro,pantalla,noCompu);
		compu[cant]=p2;
		cant++;
	}
	
	public void adicionarLaptop(String estilo, String wifi, String color, String precio, String procesador,
			String ram, String discoDuro, String pantalla, int noCompu){
		Laptop p3=new Laptop(estilo, wifi,color, precio, procesador,ram, discoDuro,pantalla,noCompu);
		compu[cant]=p3;
		cant++;
	}

}
