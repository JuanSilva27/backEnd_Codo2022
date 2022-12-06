package ar.com.codoacodo.controllers;

import java.util.List;

import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.inteface.domain.Articulo;
import dao.IArticuloDAO;

public class FindAllArticuloController {

	public static void main(String[] args) throws Exception {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		List<Articulo> articulosBuscados = dao.findAll();

		System.out.println(articulosBuscados);

	}

}
