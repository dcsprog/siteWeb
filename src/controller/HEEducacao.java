package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Encarregado;
import services.SEEducacao;

/**
 * Servlet implementation class SEEducacao
 */
@WebServlet("/HEEducacao")
public class HEEducacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SEEducacao serviceEE;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HEEducacao() {
        super();
        serviceEE = new SEEducacao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("listaEE", serviceEE.getArEducacao());
		request.getRequestDispatcher("/EEducacao.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Encarregado ee = new Encarregado(serviceEE.getArEducacao().size(),
				request.getParameter("nome"),
				request.getParameter("data_nasciemnto"),
				request.getParameter("ccidadao"),
				request.getParameter("telefoneP"),
				request.getParameter("telefoneS")
				);
		
		
		serviceEE.getArEducacao().add(ee);
		
		
		doGet(request, response);
		
		
	}

}
