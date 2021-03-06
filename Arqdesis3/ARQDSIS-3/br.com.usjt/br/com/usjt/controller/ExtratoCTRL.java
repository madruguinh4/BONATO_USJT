package br.com.usjt.controller;


import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.usjt.model.Conta;

/**
 * Servlet implementation class ManterClienteController
 */
@WebServlet("/extrato")
public class ExtratoCTRL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/conteudo/extrato.jsp");
		
		
	    String chave = request.getParameter("data[search]");
//		Vendedor vendedor = new Vendedor();
//		ListaDeClientes lista;
//		if(chave != null && chave.length() > 0){
//			lista = vendedor.listarClientes(chave);
//		} else {
//			lista = vendedor.listarClientes();
//		}
//		request.setAttribute("lista", lista);
	
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}	
}