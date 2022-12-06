package ar.com.codoacodo.inteface.herencia;

public class vendedor {
	public  static Consola[] venderConsolas() {
		
		Xbox xbox360 = new Xbox();
		Playstation play1 = new Playstation(32,1);
		Playstation play2 = new Playstation(128,2);
		Playstation play3 = new Playstation(512,3);
		Playstation play4 = new Playstation(1024,4);
		
		Sega sega = new Sega ();
		
		return new Consola[] {xbox360,play1,play2,play3,play4,sega};
		
	}
}
