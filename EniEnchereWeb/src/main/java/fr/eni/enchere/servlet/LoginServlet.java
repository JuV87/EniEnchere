package fr.eni.enchere.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.BusinessException;
import fr.eni.enchere.bo.ArticleVendu;
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
		Utilisateur user =null;
		ArticleVendu art =null;

		
		
			try {
				successLogin = BLLManager.getInstance().getUtilisateurManager().loginUser(email, password);
				
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String message = "";
		
		if (successLogin) {
			HttpSession session = request.getSession();
			
			try {
				user = BLLManager.getInstance().getUtilisateurManager().selectByemail(email);
				session.setAttribute("id", user.getNoUtilisateur());
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("HomeConnexionServlet");
			session.setAttribute("messageSucces", "Bonjour, "+user.getPrenom()+" " +user.getNom()+" vous êtes connecté(e) !");
		}
		else {
			// sinon erreur mot de passe
			response.sendRedirect("LoginServlet");
		}
	
	}

}

