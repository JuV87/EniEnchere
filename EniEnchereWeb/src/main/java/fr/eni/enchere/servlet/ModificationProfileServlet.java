package fr.eni.enchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.BusinessException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class manipulationProfile
 */
@WebServlet("/ModificationProfileServlet")
public class ModificationProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    /**
     * Default constructor. 
     */
    public ModificationProfileServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
        UtilisateurManager profilUser = new UtilisateurManager();
        int id = (int)session.getAttribute("id");
        Utilisateur user=null;
        try {
            user = profilUser.selectById(id);
        } catch (BusinessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        request.setAttribute("profil", user); 
		getServletContext().getRequestDispatcher("/WEB-INF/ModificationProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		// Je récupere l'utilisateur connecter
		Utilisateur user = null;
		 int id = (int)session.getAttribute("id");


	        try {
	            user = BLLManager.getInstance().getUtilisateurManager().selectById(id);
	        } catch (BusinessException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	        // Je récupere les nouvelles de l'utilisateur
	        user.setPseudo(request.getParameter("pseudo"));
	        user.setNom(request.getParameter("name"));
	        user.setPrenom(request.getParameter("prenom"));
	        user.setEmail(request.getParameter("email"));
	        user.setTelephone(request.getParameter("phone"));
	        user.setRue(request.getParameter("rue"));
	        user.setCodePostal(request.getParameter("codePostale"));
	        user.setVille(request.getParameter("city"));
	        user.setMotDePasse(request.getParameter("password"));
	        
	       
		// enregister utilisateur
	        
		try {
			BLLManager.getInstance().getUtilisateurManager().update(user);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("HomeConnexionServlet");
        
    }
}
		
		
	


