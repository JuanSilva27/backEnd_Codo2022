package ar.com.codoacodo.inteface.mensajeria;

public class Mensajero {
	
	private IEnviar mensajeria;
	
	public void setMensajeria(IEnviar mensajeria) {
		this.mensajeria = mensajeria;
	}
	public void mandarMensajeria(String msj) {
		this.mensajeria.enviar(msj);
	}
	public boolean tieneMensajeria() {
		return this.mensajeria!=null;
	}
}
