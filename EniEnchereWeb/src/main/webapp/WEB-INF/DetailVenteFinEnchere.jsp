<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<title>DetailVenteFinEnchere</title>
</head>
<body>
	<a href="/HomeConnexionServlet" style="color:#000000;"> ENI - Enchères </a>
	<div class="col text-center">
		<h2>a remporté l'enchere</h2>
	</div>
	<div style="padding: 1rem">
		<div class="row">
			<div class="col-sm-3">
				<div class="form-group">
					<div class="text-center">
						<img
							src="https://ae01.alicdn.com/kf/HTB1EDhcbRWD3KVjSZKPq6yp7FXaT/618-230-610mm-bricolage-ordinateur-PC-Gamer-bo-tier-en-forme-de-diamant-en-alliage-d.jpg"
							height="150px" width="150px" class="img-rounded">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div style="padding: 1rem">
		<div class="row">
			<div class="col-sm-3">
				<h6 class="mb-0" style="padding: 1rem">Meilleur offre :</h6>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<h6 class="mb-0" style="padding: 1rem">Mise à prix :</h6>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<h6 class="mb-0" style="padding: 1rem">Fin de l'enchère :</h6>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<h6 class="mb-0" style="padding: 1rem">Retrait :</h6>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<h6 class="mb-0" style="padding: 1rem">Vendeur :</h6>
			</div>
		</div>
		<div>
			<button for="enregistrer" type="button" class="btn btn-primary">Retrait effectué</button>
			<button for="supprimercompte" type="button" class="btn btn-primary "
				data-bs-toggle="button" autocomplete="off" aria-pressed="true">Contacter
				mon compte</button>
			<button for="retour" type="button" class="btn btn-primary" disabled
				data-bs-toggle="button" autocomplete="off">Back</button>
		</div>
</body>
</html>