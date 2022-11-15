package ar.com.codoacodo.buscador;

public class HomeMain {
	public static void main(String[]args) {
		
		Buscador miBuscador = new Buscador();
		
		miBuscador.cambiarClave("IronMan");;
		
		miBuscador.buscar();
		
		System.out.println("Hemos Encontrado " +miBuscador.getCantRes() + " Resultados Para '"+miBuscador.getClaveBusqueda()+"'");
	}

}
