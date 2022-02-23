package fr.eni.enchere.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.EniResponse;
import fr.eni.enchere.bll.utils.EniConstantes;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class VendreArticleServlet
 */
@WebServlet("/VendreArticleServlet")
public class VendreArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendreArticleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/VendreArticle.jsp").forward(request,response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HashMap<String, String> fieldsMap = new HashMap<String, String>();
		String[] fieldList = new String[] {"nom", "description","date-debut","date-fin","prix-initial"};
		
		// on prepare les champs a tester 
		for(String field : fieldList) 
		{
			fieldsMap.put(field, request.getParameter(field));
				
		}
		
		//  on verififie que le conrole passe 
		
		boolean controlSuccess = true;//surfaceControl(fieldsMap);
		
		// 2: on hydrate  l'utilisateur
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		
		String dateFinSTR = request.getParameter("date-fin");
		String dateDebutSTR = request.getParameter("date-debut");
		int categorieArticle = Integer.parseInt(request.getParameter("categorie"));		
	
		Date dateF = null;
		try {
			dateF = formatter.parse(dateFinSTR);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date dateD = null;
		try {
			dateD = formatter.parse(dateDebutSTR);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession();


		
				ArticleVendu article = new ArticleVendu(-1, fieldsMap.get("nom"), 
						fieldsMap.get("description"),  dateD,  dateF,
						fieldsMap.get("prix-initial"),0);
				
				//article.setCategorieArticle(new Categorie("1", "jouet"));
				
				article.setNoUtilisateur((int)session.getAttribute("id"));
				article.setNoCategorie(categorieArticle);

				
				// 3: BLL
				// Inserer que si le controle de surface fonctionne
				if (controlSuccess) {
					EniResponse eniResponse = BLLManager.getInstance().getArticleManager().ajouterArticle(article);
					
					// Si inscription success
					if (eniResponse.getCodeResponse() == EniConstantes.CODE_SUCCESS) {
						// Redirection accceuil
						response.sendRedirect("HomeConnexionServlet");
					}
					else {
						// Erreur
						response.sendRedirect("MonProfilServlet");
					}
				}
				
			}
		
	}


