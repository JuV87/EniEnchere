<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@page import="fr.eni.enchere.bo.*" %>
        
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
        <dd><a href="/EniEnchereWeb/MonProfilServlet">Mon profil</a></dd>
        <dd><a href="/EniEnchereWeb/DeconnexionServlet">Déconnexion</a></dd>
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
            
            

                    <div class="form-control">
                        <div class="mb-3">
                            <h3>Filtres:</h3>
                            <label for="disabledSelect" class="col-form-label">
                                <h5>Catégories</h5>
                            </label>
                            <select id="disabledSelect" name="categorie" class="form-select">
						<c:forEach items="${categorieList}" var="categorie">
                                    <option  value= 1> ${categorie.getLibelle()}</option>
  						 </c:forEach>
                            </select>

                            <label for="col-form-label"></label>
                            <input id="fld-recherche" class="form-control" type="text" required="required"
                                placeholder="Le nom de l'article contient" />
                        </div>
                        <div class="mb-3">
                            <div id="bouton">
                                <div class="panel-body text-center">
                                    <input type="submit" id="btRechercher" name="btRechercher" value="Rechercher"
                                        class="boutonForm" title="Rechercher" />
                                </div>
                            </div>
                        </div>
                    </div>
                </form>

                <div class="form-control">
                    <c:forEach items="${articleList}" var="article">
                        <div class="row no-gutters">
                            <div class="col-md-4">
                                <img class="card-img" src="https://ae01.alicdn.com/kf/HTB1EDhcbRWD3KVjSZKPq6yp7FXaT/618-230-610mm-bricolage-ordinateur-PC-Gamer-bo-tier-en-forme-de-diamant-en-alliage-d.jpg" alt="Photo" />
                            </div>
                            <div class="col-md-8">
                                <div class="card-body">
                                    <h5 class="card-title text-center">Titre : <a
                                            href="DetailMaVenteServlet?id=${article.getNoArticle() }">${article.getNomArticle()}</a>
                                    </h5>
                                    <p class="card-text">Prix : ${article.getPrixVente()} points</p>
                                    <p class="card-text">Description : ${article.getDescription()}</p>
                                    <p class="card-text">Debut de l'enchère : ${article.getDateDebutEnchere()}</p>
                                    <p class="card-text">Fin de l'enchère : ${article.getDateFinEnchere()}</p>
                                </div>
                            </div>
                        </div>
                       <hr></hr>
                    </c:forEach>
                </div>


            </body>

            </html>