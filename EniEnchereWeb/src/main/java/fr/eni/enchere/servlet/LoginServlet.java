package fr.eni.enchere.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.DALException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public LoginServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// render page
		getServletContext().getRequestDispatcher("/LoginPage.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		boolean successLogin = false;
		System.out.println(request.getContextPath());
		try 
		{
			successLogin = BLLManager.getInstance().getUtilisateurManager().loginUser(email, password);
			
			String message = "";
		}
		catch (DALException e) 
		{
			e.printStackTrace();
		}
		
		if (successLogin) {
			response.sendRedirect("HomeServlet");
		}
		else {
			// sinon erreur mot de passe
			response.sendRedirect("LoginServlet");
		}
	
	}

}

