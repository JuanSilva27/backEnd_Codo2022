package ar.com.codoacodo.inteface.herencia;

public class Playstation extends Consola implements IActualizar, IJugable {
	private Integer version;
	
	public Playstation(Integer bit,Integer version) {
		super("Playstation",bit,"Sony");
		this.version = version;
	}

	public Integer getVersion() {
		return version;
	}

	@Override
	public String toString() {
		String toStringDelPadre = super.toString(); 
		String toStringDeHijo = "PlayStation [version=" + version + "]";
		return toStringDelPadre + toStringDeHijo;
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		if(this.version==3) {
			System.out.println("actualiznado play " + this.version);
			System.out.println("conectando al servidor de sony");
			System.out.println("descargando nuevo software");
		} else {
			System.out.println("Play " + this.version + " no se puede actualizar" );
		}
	}
	
	public void jugar() {
		System.out.println("Encendiendo Play" + this.version);
		System.out.println("Cargando juegos del HD");
		System.out.println("Todo listo seleccione juego");
	}
	
	
}
