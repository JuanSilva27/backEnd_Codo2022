package ar.com.codoacodo.inteface.mensajeria;

public class DefaultImpl implements IEnviar{
	
	private String emailTarget = "destino@mail.com";
	private String emailSource = "yo@yo.com";
	private String provider = "gmail";
	//etc
	
	//cumplo el contrato
	public void enviar(String msj) {
		System.out.println("Enviando mail a " + emailTarget);
		System.out.println("Enviando desde " + emailSource);
		System.out.println("Usando " + provider);
	}
}