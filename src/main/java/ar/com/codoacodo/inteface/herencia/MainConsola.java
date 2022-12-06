package ar.com.codoacodo.inteface.herencia;

public class MainConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consola[] consolas = vendedor.venderConsolas();
		
		for(int i = 0;i< consolas.length;i++) {
			Consola aux = consolas[i];
			
			aux.mostrar();
			if (aux instanceof IActualizar ) {
				IActualizar instancia = (IActualizar)aux;
				instancia.actualizar();
				
			} else {
				System.out.println(aux.getNombre() + " NO es actualizable");
			}
			
			if (aux instanceof IJugable ) {
				System.out.println(aux.getNombre() + " es juagable");
				IJugable instancia = (IJugable)aux;
				instancia.jugar();
			} else {
				System.out.println(aux.getNombre() + " NO es jugable");
			}
			System.out.println("-------------------------------");
		}
		
	}

}
