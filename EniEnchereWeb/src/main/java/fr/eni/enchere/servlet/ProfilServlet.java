package fr.eni.enchere.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
import fr.eni.enchere.dao.DALException;

/**
 * Servlet implementation class Profil
 */
@WebServlet("/ProfilServlet")
public class ProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        request.getRequestDispatcher("/WEB-INF/Profil.jsp").forward(request,response); 
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
