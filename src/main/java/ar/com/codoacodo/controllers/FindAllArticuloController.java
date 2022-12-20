package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;
import dao.IArticuloDAO;

@WebServlet("/FindAllArticuloController")
public class FindAllArticuloController extends HttpServlet {

	//http://localhost:8080/webapp/FindAllArticuloController
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		List<Articulo> articulosBuscados = new ArrayList<>();
		try {
			articulosBuscados = dao.findAll();
			System.out.println(articulosBuscados);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.setAttribute("listado", articulosBuscados);
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
	
	public static void main(String[] args) throws Exception {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		List<Articulo> articulosBuscados = dao.findAll();

		System.out.println(articulosBuscados);

	}

}
