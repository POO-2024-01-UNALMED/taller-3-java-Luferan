package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	private static int numTV = 0;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		
		TV.numTV++;
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnON() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
}
