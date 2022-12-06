package ar.com.codoacodo.inteface.mensajeria;

public class CreadorDeMensajeria {
	public static IEnviar crearMensajeria(String target) {
		IEnviar mensajeria = null;
		switch(target) {
		case "A":
			mensajeria = new EnviarMailImpl();
			break;
		case "B":
			mensajeria = new EnviarHDImpl();
			break;
		case "C":
			mensajeria = new EnviarDBImpl();
			break;
		default:
			System.out.println("Opcion Invalida");
			break;
		}
		
		return mensajeria;
	}
}
