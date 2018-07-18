package br.com.praticaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.praticaweb.model.Produto;

public class HomeServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
							//verificando se tem o produto na sessão	  .guardando o produto
		ArrayList<Produto> produtos = (ArrayList<Produto>)request.getSession().getAttribute("produto");
		if (produtos == null) {
			produtos = new ArrayList<>();
			
			Produto prod1 = new Produto();
			prod1.setCodigo(0);
			prod1.setFabricante("teste");
			prod1.setNome("Blabla");
			prod1.setValor(0);
			
			Produto prod2 = new Produto();
			prod2.setCodigo(1);
			prod2.setFabricante("teste2");
			prod2.setNome("Blabla");
			prod2.setValor(0);
			
			produtos.add(prod1);
			produtos.add(prod2);
			
			request.getSession().setAttribute("produto", produtos);
			
			RequestDispatcher view = request.getRequestDispatcher("home.jsp");
			view.forward(request, response);

		}
		
		
	}

}
