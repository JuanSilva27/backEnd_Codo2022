package ar.com.codoacodo.inteface.herencia;

public class Xbox extends Consola implements IActualizar{
	public Xbox(){
		super("Xbox360",1024,"Microsoft");
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("conectando xbox al servidor de microsfot...");
		System.out.println("descargando nuevo firmware..");
		System.out.println("finalizando instalacion");
	}
}
