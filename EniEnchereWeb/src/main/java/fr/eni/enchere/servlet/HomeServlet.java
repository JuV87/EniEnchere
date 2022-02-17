package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
			List<Article> catégorie;
			ses=request.getSession();
			catégorie=(List<Article>)ses.getAttribute("maCatégorie");
			request.setAttribute("catégorie",catégorie);
			getServletContext().getRequestDispatcher("/WEB-INF/catégorie.jsp").forward(request, response);
			
		}
		if (disabledSelect== "Véhicules") {
			
			
		}
		if (disabledSelect== "Mobilier") {
			
			
		}
		if (disabledSelect== "Animaux") {
			
			
		}		
		if (disabledSelect== "Informatiques") {
			
			
		}				
	}
	


*/	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
