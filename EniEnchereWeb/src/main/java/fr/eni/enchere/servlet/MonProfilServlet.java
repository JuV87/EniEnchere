package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bll.BLLManager;
import fr.eni.enchere.bll.EniResponse;
import fr.eni.enchere.bll.utils.EniConstantes;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class MonProfilServlet
 */
@WebServlet("/MonProfilServlet")
public class MonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonProfilServlet() {
        super();      
    }
    /**
     * Controle de surface 
     * @param field
     * @return
     */
    public boolean surfaceControl(HashMap<String, String> fields) {
    	// Par défaut success est True
    	boolean success = true;
    	
    	// On controle chaque champ
    	for (String field : fields.values()) {
    		// Si le champs est vide ou null
    		if (field.isEmpty()) {
    			// Success -> False
    			success = false;
    		} 
    	}
    return success;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/MonProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, String> fieldsMap = new HashMap<String, String>();
		String[] fieldList = new String[] {"pseudo", "name","prenom", "email", "phone", "rue","codePostale", "city","password"};
		
		// on prepare les champs a tester 
		for(String field : fieldList ) 
		{
			fieldsMap.put(field, request.getParameter(field));
				
		}
		
		//  on verififie que le conrole passe 
		
		boolean controlSuccess = surfaceControl(fieldsMap);
		
		// 2: on hydrate  l'utilisateur
				Utilisateur user = new Utilisateur(-1, fieldsMap.get("pseudo"), 
						fieldsMap.get("name"), fieldsMap.get("prenom"), fieldsMap.get("email"),
						fieldsMap.get("phone"), fieldsMap.get("rue"), fieldsMap.get("codePostale"), 
						fieldsMap.get("city"), fieldsMap.get("password"), 0, 0);
		
				// 3: BLL
				// Inserer que si le controle de surface fonctionne
				if (controlSuccess) {
					EniResponse eniResponse = BLLManager.getInstance().getUtilisateurManager().ajouterUtilisateur(user);
					
					// Si inscription success
					if (eniResponse.getCodeResponse() == EniConstantes.CODE_SUCCESS) {
						// Redirection accceuil
						response.sendRedirect("LoginServlet");
					}
					else {
						// Erreur
						response.sendRedirect("MonProfilServlet");
					}
				}
				else {
					// Reste sur la meme page mais avec message d'erreur par rapport au donnees saisie
					response.sendRedirect("MonProfilServlet");
				}
			}
				
		
	
		
	}

	
	
	

