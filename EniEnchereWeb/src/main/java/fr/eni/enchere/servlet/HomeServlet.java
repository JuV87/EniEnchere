package fr.eni.enchere.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.BusinessException;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.dao.DAOFactory;




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

		List<ArticleVendu> articleList = null;
		try {
			articleList = BLLManager.getInstance().getArticleManager().selectionnerTousLesArticles();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// pour test
//		List<ArticleVendu> articleList = new ArrayList<ArticleVendu>();
//		articleList.add(new ArticleVendu(1,"Article1", "Description",new Date() , new Date() , "lol", 1,ArticleVendu.EtatVente.En_Cours));
		
		//je le put dans la vue
		request.setAttribute("articleList", articleList);
		
		//j'affiche la vue
		getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);

		
		
		
     	try {
			BLLManager.getInstance().getArticleManager().selectById(1);
		} catch (BusinessException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	
//     	list <article> DAOFactory.getInstance().getUtilisateurDAO().select(user.getNoUtilisateur);
     	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCategorie = request.getParameter("categorie");
		
//		public void Recuperation () {
//			if idCategorie ==1 ...
//		}
		
		
		

//select from ARTICLES_VENDUS where nom_article like fld-recherche or disabledSelect;		
		
		getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);
	}	
}















