package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Persona;
import Modelo.PersonaDAO;

/**
 * Servlet implementation class Validar
 */
@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    PersonaDAO pdao = new PersonaDAO();
    Persona pe =new Persona();
    
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion =request.getParameter("accion");
		
		if(accion.equalsIgnoreCase("ingresar")) {
			String user=request.getParameter("txtuser");
			String pass=request.getParameter("txtpass");	
			
			
			//pe=pdao.Validar(user, pass);
			PersonaDAO.Validar(user, pass);
			
			if(pe.getIdUsuario()!=null) {
				request.getRequestDispatcher("Controlador?accion=Principal").forward(request, response);
			}else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
				System.out.println("El IDUsuario no tiene valor" );
			}
				
		}
		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			
		}
		
	}

}
