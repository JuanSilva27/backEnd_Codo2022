package ar.com.codoacodo.inteface.herencia;

public class Consola {

	private String nombre;
	protected Integer bit;
	private String marca;
	
	public Consola(String nombre, Integer bit, String marca) {
		this.nombre = nombre;
		this.bit = bit;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getBit() {
		return bit;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Consola [nombre=" + nombre + ", bit=" + bit + ", marca=" + marca + "]";
	}
	
	public void mostrar () {
		System.out.println(toString());
	}
	
}
