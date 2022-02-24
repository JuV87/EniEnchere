<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
<html>

<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DetailVente</title>
</head>
<body>

	<a href="/HomeConnexionServlet" style="color:#000000;"> ENI - Enchères </a>

	<div class="col text-center">
		<h2>Détail vente :</h2>
	</div>
	<div style="padding: 1rem">
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Article :</th>
					<td> ${article.getNomArticle()}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Description :</th>
					<td> ${article.getDescription()}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Catégorie :</th>
					<td> ${article.getCategorieArticle()}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Meilleure offre :</th>
					<td> ${article.getPrixVente()}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Mise à prix :</th>
					<td> ${article.getMiseAPrix()}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Fin de l'enchère : </th>
					<td> ${article.getDateFinEnchere()}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Retrait :</th>
					<td> ${article.getLieuRetrait()}</td>
				</tr>
			</div>
		</div>
	
	<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Vendeur : </th>
					<td> ${article.getUser().getNom()}</td>
				</tr>
			</div>
		</div>
	</div>
			<button for="enregistrer" type="button" class="btn btn-primary">Annuler
				la vente</button>
			<button for="supprimercompte" type="button" class="btn btn-primary "
				data-bs-toggle="button" autocomplete="off" aria-pressed="true">Back
			</button>
		</div>
</body>
</html>