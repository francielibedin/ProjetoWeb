package br.com.praticaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.praticaweb.model.Produto;

public class CadastroProdutoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("novo-produto.jsp");
		view.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Produto> produtos = (ArrayList<Produto>)request.getSession().getAttribute("produto");
		
		Produto prod = new Produto();		
		String codigo = request.getParameter("codigo");
		prod.setCodigo(Integer.valueOf(codigo));
		
		String fabricante = request.getParameter("fabricante");
		prod.setFabricante(fabricante);
		
		String nome = request.getParameter("nome");
		prod.setNome(nome);
		
		String valor = request.getParameter("valor");
		prod.setValor(Long.parseLong(valor));
		
		produtos.add(prod);
		
		RequestDispatcher view = request.getRequestDispatcher("home.jsp");
		view.forward(request, response);
	}
}
