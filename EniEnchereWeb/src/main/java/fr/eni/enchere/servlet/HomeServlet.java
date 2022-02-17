package fr.eni.enchere.servlet;

import java.io.IOException;
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
	}

	

	private void rechercher (HttpServletRequest request, HttpServletResponse response) {
		String disabledSelect =request.getParameter("disabledSelect");
	}
	/*			
		if (disabledSelect== "toutes") {
			HttpSession ses;
			List<ArticleVendu> listeCategorieArticle;
			ses=request.getSession();
			listeCategorieArticle=(List<ArticleVendu>)ses.getAttribute("maCatégorie");
			request.setAttribute("catégorie",listeCategorieArticle);
			try {
				getServletContext().getRequestDispatcher("/WEB-INF/#.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}				
	}
	


*/	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
