package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.inteface.domain.Articulo;
import dao.IArticuloDAO;

public class CreateArticuloController {

	public static void main(String[] args) throws Exception {
		
		String titulo = "Titulo nuevo";
		String autor = "Autor Nuevo";
		String img= "img.jpg";
		Float precio= 150.0f;
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		Articulo articulo = new Articulo(titulo,autor,precio,img);
		
		System.out.println("antes: " + articulo);
		
		dao.create(articulo);;
		
		System.out.println("despues: " + articulo);

	}

}
