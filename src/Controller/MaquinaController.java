package Controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Core.EstadoFactory;
import Model.Estado;

@WebServlet({ "/MaquinaController", "/" })
public class MaquinaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Estado estado;

	public MaquinaController() {
		super();
		if (estado == null) {
			EstadoFactory factory = new EstadoFactory();
			estado = factory.criar();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String valorSelecionado = request.getParameter("valorSelecionado");
		if (valorSelecionado != null) {
			Estado.TERMINAIS en = Estado.TERMINAIS.valueOf(valorSelecionado);
			if (estado.getEstadosFuturos().containsKey(en))
				estado = estado.getEstadosFuturos().get(en);
		}
		System.out.println(estado.getNome());
		request.setAttribute("estado", estado);
		RequestDispatcher dispacher = request.getRequestDispatcher("main.jsp");
		dispacher.forward(request, response);

	}

}
