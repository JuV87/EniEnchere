package fr.eni.enchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class manipulationProfile
 */
@WebServlet("/manipulationProfile")
public class manipulationProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    /**
     * Default constructor. 
     */
    public manipulationProfile() {
        // TODO Auto-generated constructor stub
    }

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
		String enregistrer = request.getParameter("enregistrer");
		String supprimercompte = request.getParameter("supprimer mon compte ");
		String retour = request.getParameter("retour");
		
		// recuperation de l'action appuie sur enregistrer 
	        if ( !empty == enregistrer ) 	        
	        HttpSession session = request.getSession( true );
	        session.setAttribute( "enregistrer", enregistrer );	       	        
	        request.getRequestDispatcher( "envoyer vers page de connexion" ).forward( request, response );
	        
	        
	        
	        
	        
	        }
		
		
	}


