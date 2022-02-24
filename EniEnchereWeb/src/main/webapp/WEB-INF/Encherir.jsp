<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
</head>
<body>
	<h1>
		<a href="HomeConnexionServlet" style="color: #000000;">ENI-Enchères</a>
	</h1>
	<div class="col text-center">
		<h2>Détail vente</h2>
	</div>
	<div style="padding: 1rem">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3">
					<h6>${article.getNomArticle()}</h6>
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
				<form action="EncherirServlet?id=${article.getNoArticle()}"
					method="post">
					<div class="form-control" class="text-md-center">

						<table id="subscription-table" class="subscription-table">
							<tbody>
								<tr>
									<th>Description :</th>
									<td>${article.getDescription()}</td>
								</tr>
								<tr>
									<th>Catégorie :</th>
									<td>${article.getCategorieArticle().getLibelle()}</td>
								</tr>
								<tr>
									<th>Meilleure offre :</th>
									<td>${article.getPrixVente()}</td>
								</tr>
								<tr>
									<th>Mise à prix :</th>
									<td>${article.getMiseAPrix()}</td>
								</tr>
								<tr>
									<th>Fin enchères :</th>
									<td>${article.getDateFinEnchere()}</td>
								</tr>
								<tr>
									<th>Retrait :</th>
									<td>${article.getLieuRetrait()}</td>
								</tr>
								<tr>
									<th>Vendeur :</th>
									<td>${article.getUser().getNom()}</td>
								</tr>
								<tr>
									<th>Ma proposition :</th>
									
									<td><label for="prix-initial"></label> <input
										type="number" id="prix-initial" name="prix" min="1"></td>
								</tr>
							</tbody>
						</table>
						<br>
						<div class="text-center">
							<button type="submit" class="btn w-10 btn-primary">Enchérir</button>
							<a href="HomeConnexionServlet" type="submit"
								class="btn w-10 btn-primary">Retour</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>