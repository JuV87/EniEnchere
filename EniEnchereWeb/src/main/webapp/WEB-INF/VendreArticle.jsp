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
		<title>Vendre article</title>
	</head>

	<body>
		<form method="post" action="VendreArticleServlet">
			<h1>ENI-Enchère</h1>
			<div class="col text-center">
				<h2>Nouvelle vente</h2>
			</div>

			<div style="padding: 1rem">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group">
							<label for="nom"></label>
							<h6>Article :</h6>
							<input type="text" class="form-control" id="article" name="nom">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group">
							<label for="selection"></label>
							<h6>Catégorie :</h6>
							<select id="selection" class="form-control" name="categorie">
								<option value=""></option>
								<option value="">Option 1</option>
								<option value="">Option 2</option>
								<option value="">Option 3</option>
							</select>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group">
							<label for="bio"></label>
							<h6>Description :</h6>
							<textarea class="form-control" id="bio" rows="3" name="description"></textarea>
						</div>
					</div>
				</div>
			</div>

			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<h6>Photo de l'article</h6>
					</div>
					<div class="col-sm-6">
						<button type="button" class="btn btn-primary btn-sm">UPLOADER</button>
					</div>
				</div>
			</div>


			<div style="padding: 1rem">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group">
							<div class="text-center">
								<img src="https://ae01.alicdn.com/kf/HTB1EDhcbRWD3KVjSZKPq6yp7FXaT/618-230-610mm-bricolage-ordinateur-PC-Gamer-bo-tier-en-forme-de-diamant-en-alliage-d.jpg"
									height="150px" width="150px" class="img-rounded">
							</div>
						</div>
					</div>
				</div>
			</div>
			<div style="padding: 1rem">
				<div class="container">
					<div class="row">
						<div class="col-sm-3">
							<div class="form-group">
								<label for="prix-initial"></label>
								<h6>Prix initial :</h6>
								<input type="text" id="prix-initial" name="tentacles" min="1" max="150"
									name="prix-initial">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div style="padding: 1rem">
				<label for="start"></label>
				<h6>Date de l'enchère</h6>
				<input type="date" id="start"  value="2022-03-01" min="2022-01-01" max="3000-12-31"
					name="date-debut">
			</div>
			<div style="padding: 1rem">
				<label for="start"></label>
				<h6>Fin de l'enchère</h6>
				<input type="date" id="start" value="2022-03-01" min="2022-01-01" max="3000-12-31"
					name="date-fin">
			</div>
			<div style="padding: 1rem">
				<div class="row">
					<div class="col-sm-3">
						<h6 class="mb-0" style="padding: 1rem">Retrait :</h6>
					</div>
				</div>
			</div>
			<div class="col text-left">

				<input type="submit" class="btn btn-primary col-6" value="Enregistrer">
				<button onclick="window.location.href = './HomeConnexionServlet';" type="button" class="btn btn-primary"
					data-bs-toggle="button" autocomplete="off" aria-pressed="true">Annuler</button>
			</div>
		</form>
	</body>

	</html>