package fr.eni.enchere.bll;

public class BLLManager {

	private static BLLManager instance;
	
	private UtilisateurManager utilisateurManager;
	private ArticleManager articleManager;
	
	public static BLLManager getInstance() {
		if (instance == null) {
			instance = new BLLManager();
		}
		
		return instance;
	}

	public UtilisateurManager getUtilisateurManager() {
		if (utilisateurManager == null) {
			utilisateurManager = new UtilisateurManager();
		}
		return utilisateurManager;
	}
	
	public ArticleManager getArticleManager() {
		if (articleManager == null) {
			articleManager = new ArticleManager();
		}
		return articleManager;
	}
}