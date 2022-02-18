package fr.eni.enchere.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/MonProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, String> fieldsMap = new HashMap<String, String>();
		String[] fieldList = new String[] {"pseudo", "nom"," prenom", "email"," telephone", "rue"," codePostal", "ville"," motDePasse", "credit"," administrateur"};
		
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
					EniEncherResponse eniEncherResponse = " attendre creation manager " .getUtilisaterManager().registerUser(user);
					
					// Si inscription success
					if (eniEncherResponse.getCodeResponse() == Constantes.CODE_SUCCESS) {
						// Redirection accceuil
						response.sendRedirect("LoginServlet");
					}
					else {
						// Erreur
						response.sendRedirect("RegisterServlet");
					}
				}
				else {
					// Reste sur la meme page mais avec message d'erreur par rapport au donnees saisie
					response.sendRedirect("RegisterServlet");
				}
			}
				
		
		// Controle de surface 
		/*String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String rue = request.getParameter("rue");
		String codepostal = request.getParameter("code postal");
		String ville = request.getParameter("nom de la ville");
		String motdepasse = request.getParameter("mot de passe");
		String confirmation = request.getParameter("confirmation");
		String credit = request.getParameter("credit");
		
		
		UserAccount userAccount = DataDAO.findUser(pseudo, nom, prenom, email, telephone,rue,
		 code postal,non de la ville,mot de passe,confirmation,credit );

		if (userAccount == null && motdepasse == confirmation) {
			String Message = "compte creer";

			request.setAttribute("Message", Message);

			RequestDispatcher dispatcher //
					= this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");

			dispatcher.forward(request, response);
			return;
		}
		*/
		
	}

	
	
	
}
