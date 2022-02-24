package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bo.ArticleVendu;

/**
 * Servlet implementation class HomeConnexionServlet
 */
@WebServlet("/HomeConnexionServlet")
public class HomeConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeConnexionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ArticleVendu> articleList = null;
		try {
			articleList = BLLManager.getInstance().getArticleManager().selectionnerTousLesArticles();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		request.setAttribute("articleList", articleList);
		getServletContext().getRequestDispatcher("/HomeConnexionPage.jsp").forward(request, response);

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
