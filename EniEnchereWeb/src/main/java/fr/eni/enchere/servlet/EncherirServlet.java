package fr.eni.enchere.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.BusinessException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class EncherirServlet
 */
@WebServlet("/EncherirServlet")
public class EncherirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncherirServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        request.getRequestDispatcher("/WEB-INF/Encherir.jsp").forward(request,response);
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Utilisateur user =null;
		ArticleVendu art =null;		
		int prix=Integer.parseInt(request.getParameter("prix"));
		int articleId = Integer.parseInt(request.getParameter("id"));
		
		try {
			user = BLLManager.getInstance().getUtilisateurManager().selectById((int) session.getAttribute("id"));
			art = BLLManager.getInstance().getArticleManager().selectById(articleId);
		} catch (BusinessException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//appel à la BLL
		BLLManager.getInstance().getArticleManager().encherir(art, user, prix);
		
		
		
		request.setAttribute("article", art);
		request.setAttribute("user", user);
		response.sendRedirect("HomeConnexionServlet");
		 //  RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/HomeConnexionServlet");
	    //    rd.forward(request, response);
	}
}
