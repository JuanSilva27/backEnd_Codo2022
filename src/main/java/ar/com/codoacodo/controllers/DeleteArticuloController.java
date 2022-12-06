package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import dao.IArticuloDAO;

public class DeleteArticuloController {

	public static void main(String[] args) throws Exception {
		
		//eliminar un articulo por id=1
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		dao.delete(2L);
	}

}
