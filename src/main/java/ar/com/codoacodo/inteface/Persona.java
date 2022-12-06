package ar.com.codoacodo.inteface;

public class Persona {

	private String nombre;
	private String idioma;
	private String[] otrosIdiomas;
	
	public Persona(String nombre, String idioma) {
		setNombre(nombre);
		setIdioma(idioma);
		setOtrosIdiomas(new String[0]);
	}
	
	public void decir(String palabra) {
		System.out.println(getNombre() + " dice " + palabra + " en " + getIdioma());
	}
	
	
	public void decir(String algo, String idioma) {
		if(getIdioma() .equals(idioma) || existe(idioma)) {
			System.out.println(getNombre() + " dice " + algo + " en " + getIdioma());
		}
		else {
			System.out.println(getNombre() + " no habla " + idioma);
		}
		
	}
	
	
	private boolean existe (String idioma) {
		boolean exist = false;
		for (int i=0; !exist && i < getOtrosIdiomas().length; i++) {
			
			exist = getOtrosIdiomas()[i]==idioma;
		}
		return exist;
	}
	
	
	public void aprender(String nuevoIdioma) {
		
		if(!getIdioma() .equals(idioma) || !existe(idioma)) {
			String[] nuevosIdiomas = new String[this.otrosIdiomas.length + 1];
			
			for (int i=0;i<this.otrosIdiomas.length;i++) {
				nuevosIdiomas[i] = this.otrosIdiomas[i];
			}
			nuevosIdiomas[this.otrosIdiomas.length] = nuevoIdioma;
			setOtrosIdiomas(nuevosIdiomas);
		}
		
		
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public String[] getOtrosIdiomas() {
		return otrosIdiomas;
	}
	
	private void setOtrosIdiomas(String[] idiomas) {
		this.otrosIdiomas = idiomas; 
	}
	
}