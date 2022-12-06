package ar.com.codoacodo.inteface.mensajeria;

public class MainMensajeria {

	public static void main(String[] args) {
		String target = "A";
		String mensaje = "Aprendiendo interfaces en Java";
		
		Mensajero mensajero = new Mensajero();
		
		switch(target) {
		case "A":
			mensajero.setMensajeria(new EnviarMailImpl());
			break;
		case "B":
			mensajero.setMensajeria(new EnviarHDImpl());
			break;
		case "C":
			mensajero.setMensajeria(new EnviarDBImpl());
			break;
		default:
			System.out.println("Opcion Invalida");
			break;
		}
		
		if(mensajero.tieneMensajeria()) {
			mensajero.mandarMensajeria(mensaje);
		}
	}

}
