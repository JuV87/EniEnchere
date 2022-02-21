package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bo.ArticleVendu;




/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);
	
		// pour test
		//List<ArticleVendu> articleList = new ArrayList<ArticleVendu>();
		//articleList.add(new ArticleVendu(1,"Article1", "Description 1", 0, 0 , 0, 0,ArticleVendu.EtatVente.En_Cours));
		
		//je le put dans la vue
		//request.setAttribute("articleList", articleList);
		
		//j'affiche la vue
		//getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCategorie = request.getParameter("categorie");
		// where dans la BLL
		
		
		getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);
	}

}