package ar.com.codoacodo.inteface.mensajeria;

public class MainMensajeriaConCreadorDeMensajeria {

	public static void main(String[] args) {
		String target = "A";
		String mensaje = "Aprendiendo interfaces en Java";
		
		IEnviar msj = CreadorDeMensajeria.crearMensajeria(target);
		
		msj.enviar(mensaje);
	}

}
