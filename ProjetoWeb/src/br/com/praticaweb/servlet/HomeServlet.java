package br.com.praticaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//verificando se tem o produto na sessão	  .guardando o produto
		ArrayList<String> produtos = (ArrayList<String>)request.getSession().getAttribute("produto");
		
		if (produtos == null) {
			ArrayList<String> produto = new ArrayList<>();
			produto.add("a");
			produto.add("b");
			produto.add("c");
			produto.add("d");
			
			request.getSession().setAttribute("produto", produto);
			
			RequestDispatcher view = request.getRequestDispatcher("home.jsp");
			view.forward(request, response);

		}
		
		
	}

}
