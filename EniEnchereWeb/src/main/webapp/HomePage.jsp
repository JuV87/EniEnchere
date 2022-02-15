<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
	<h1>ENI-Enchère</h1>
	<a href="#" id="my-account">S'inscrire</a> - <a href="#">Se connecter</a>

	<body>
			<div class="mb-3">
		<h3>Filtres:</h3>
			<label for="disabledSelect" class="form-label">Catégories</label>
			<select id="disabledSelect" class="form-select">
				<option>Toutes</option>
				<option>????</option>
				<option>????</option>
				<option>????</option>
				<option>????</option>
				<option>????</option>
			</select>

			<div class="form-control">
				<label for="col-form-label"></label>
				<input id="fld-recherche" class="form-control" type="text" required="required"
					placeholder="Le nom de l'article contient" />
						
			</div>
			<div class="mb-3">
			<div id="bouton">
				<input type="submit" name="btRechercher" value="Rechercher" class="boutonForm" title="Rechercher" />
			</div>
			</div>
		</div>
	</body>

	</html>