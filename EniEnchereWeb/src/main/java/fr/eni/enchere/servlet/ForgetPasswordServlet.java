package fr.eni.enchere.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.BusinessException;
import fr.eni.enchere.bll.UtilisateurManager;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgetPassword")
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgetPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("/ForgetPassword.jsp ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		
			// recuperation des parametres de la requette
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if (email != null )
			
			 //soumettre 
		
		 HttpSession  maSession = request.getSession();
		 maSession.setAttribute(password, email);
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginServlet");
		 dispatcher.forward(request, response);
		 
		
		 
	
	}

}
