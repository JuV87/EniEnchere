<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>

        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


    </head>
    <div class="form-control">
        <h1>ENI-Enchère</h1>
        <dd><a href="/EniEnchereWeb/VendreArticleServlet">Vendre un article</a></dd>
        <dd><a href="/EniEnchereWeb/ProfilServlet">Mon profil</a></dd>
        <p>${sessionScope.messageSucces}</p>

    </div>
    

    <body>
        <div class="form-control">
            <div class="mb-3">
                <h3>Filtres:</h3>

                <h6>Achats:</h6>
                <dd>
                    <div>
                        <input type="radio" id="enchères ouvertes" name="drone2" value="enchères ouvertes">
                        <label for="enchères ouvertes">enchères ouvertes</label>
                    </div>

                    <div>
                        <input type="radio" id="mes enchéres en cours" name="drone2" value="mes enchéres en cours">
                        <label for="mes enchéres en cours">mes enchéres en cours</label>

                    </div>
                    <div>
                        <input type="radio" id="mes enchères remportées" name="drone2" value="mes enchères remportées"
                            checked>
                        <label for="mes enchères remportées">mes enchères remportées</label>
                </dd>
            </div>


            <h6>Mes ventes:</h6>
            <div>
                <input type="radio" id="mes ventes en cours" name="drone2" value="mes ventes en cours">
                <label for="mes ventes en cours">mes ventes en cours</label>
            </div>

            <div>
                <input type="radio" id="ventes non débutées" name="drone2" value="ventes non débutées">
                <label for="ventes non débutées">ventes non débutées</label>
            </div>

            <div>
                <input type="radio" id="ventes terminées" name="drone2" value="ventes terminées">
                <label for="ventes terminées">ventes terminées</label>
            </div>
            <br></br>
            <div class="mb-3">
                <label for="disabledSelect" class="col-form-label"><h5>Catégories</h5></label>
                <select id="disabledSelect" name="categorie" class="form-select">
                    <option id="toutes" value=1>Toutes</option>
                    <option id="véhicules" value=2>Véhicules</option>
                    <option id="mobiliers" value=3>Mobiliers</option>
                    <option id="animaux" value=4>Animaux</option>
                    <option id="informatiques" value=5>Informatiques</option>
                </select>


                <label for="col-form-label"></label>
                <input id="fld-recherche" class="form-control" type="text" required="required"
                    placeholder="Le nom de l'article contient" />
            </div>
            <div class="mb-3">
                <div id="bouton">
                    <div class="panel-body text-center">
                        <input type="submit" id="btRechercher" name="btRechercher" value="Rechercher" class="boutonForm"
                            title="Rechercher" />
                    </div>
                </div>
            </div>
        </div>
	<div class="form-control">
		<c:forEach items="${articleList}" var="article">
			<div class="row no-gutters">
				<div class="col-md-4">
					<img class="card-img" src="WEB-INF/images/mshopping.png"
						alt="Photo d'ordinateur" />>
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h5 class="card-title text-center">Titre : ${article.getNomArticle()}</h5>
						<a href="DetailMaVenteServlet?id=${article.getNoArticle()}">${article.getNomArticle()}</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>

	<div class="form-control">
		<div class="form-control">
			<c:set var="nbArticleVendu" value="0" scope="page" />
			<c:forEach var="articleVendu" items="${listeArticleVendu}">
				<c:set var="nbArticleVendu" value="${nbArticleVendu + 1}"
					scope="page" />
				<div class="row no-gutters">
					<div class="col-md-4">
						<img class="card-img"
							src="https://ae01.alicdn.com/kf/HTB1EDhcbRWD3KVjSZKPq6yp7FXaT/618-230-610mm-bricolage-ordinateur-PC-Gamer-bo-tier-en-forme-de-diamant-en-alliage-d.jpg">
					</div>

					<div class="col-md-8">
						<div class="card-body">
							<h5 class="card-title text-center">Titre :
								${articleVendu.nom}</h5>
							<p class="card-text">Prix : ${articleVendu.prixVente} points</p>
							<p class="card-text">Description :
								${articleVendu.description}</p>
							<p class="card-text">Fin de l'enchère :
								${articleVendu.dateFinEncheres}</p>
							<p class="card-text">Retrait : ${articleVendu.DateFinEnchere}</p>
							<p class="card-text">Vendeur : ${utilisateur.Pseudo}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>


		<div class="form-control">
			<c:set var="nbArticleVendu" value="0" scope="page" />
			<c:forEach var="articleVendu" items="${listeArticleVendu}">
				<c:set var="nbArticleVendu" value="${nbArticleVendu + 2}"
					scope="page" />
				<div class="row no-gutters">
					<div class="col-md-4">
						<img class="card-img"
							src="http://www.cevennes-gite.eu/data/images/blog/blog-2020/dsc_3889w.jpg">
					</div>

					<div class="col-md-8">
						<div class="card-body">
							<h5 class="card-title text-center">Titre :
								${articleVendu.nom}</h5>
							<p class="card-text">Prix : ${articleVendu.prixVente} points</p>
							<p class="card-text">Description :
								${articleVendu.description}</p>
							<p class="card-text">Fin de l'enchère :
								${articleVendu.dateFinEncheres}</p>
							<p class="card-text">Retrait : ${articleVendu.DateFinEnchere}</p>
							<p class="card-text">Vendeur : ${utilisateur.Pseudo}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

	------------------------------------------ A EFFACER: ----------------------------------------------s



        <div class="form-control">
            <div class="form-control">

                <img src="https://ae01.alicdn.com/kf/HTB1EDhcbRWD3KVjSZKPq6yp7FXaT/618-230-610mm-bricolage-ordinateur-PC-Gamer-bo-tier-en-forme-de-diamant-en-alliage-d.jpg"
                    height="150px" width="150px" class="img-rounded">


                <table id="subscription-table" class="subscription-table">


                    <tbody>

                        <a aAfficher></a>

                        <h5>PC Gamer pour travailler</h5>

                        <tr>
                            <th>Prix:</th>
                            <td>210 points</td>
                        </tr>
                        <tr>
                            <th>Classement</th>
                            <td>2</td>
                        </tr>
                        <tr>
                            <th>Fin de l'enchére:</th>
                            <td>10/08/2018</td>
                        </tr>
                        <tr>
                            <th>Retrait:</th>
                            <td>10 allée des Alouettes 44800 Saint Herblain</td>
                        </tr>
                        <tr>
                            <th>Vendeur:</th>
                            <td>jojo44</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="form-control">

                <img src="http://www.cevennes-gite.eu/data/images/blog/blog-2020/dsc_3889w.jpg" height="150px"
                    width="150px" class="img-rounded">

                <table id="subscription-table" class="subscription-table">
                    <tbody>
                        <h5>Rocket stove pour riz et pâtes</h5>

                        <tr>
                            <th>Prix:</th>
                            <td>185 points</td>
                        </tr>
                        <tr>
                            <th>Classement</th>
                            <td>2</td>
                        </tr>
                        <tr>
                            <th>Fin de l'enchére:</th>
                            <td>09/10/2018</td>
                        </tr>
                        <tr>
                            <th>Retrait:</th>
                            <td>5 rue des Pinsons 44000 Nantes</td>
                        </tr>
                        <tr>
                            <th>Vendeur:</th>
                            <td>NineJea</td>
                        </tr>
                    </tbody>
                </table>
            </div>

        </div>


        </div>
    </body>

    </html>