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
	<h1><a href="HomeConnexionServlet" style="color:#000000;">ENI-Enchères</a></h1>
	<div class="col text-center">
		<h2>Détail vente</h2>
	</div>
	<div style="padding: 1rem">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3">
					<h6>PC gamer pour travailler</h6>
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
				<h6>Retrait</h6>
				<div class="form-control" class="text-md-center">
					<table id="subscription-table" class="subscription-table">
						<tbody>
							<tr>
								<th>Description :</th>
								<td></td>
							</tr>
							<tr>
								<th>Catégorie:</th>
								<td>Informatique</td>
							</tr>
							<tr>
								<th>Meilleure offre :</th>
								<td>210 pts par bob</td>
							</tr>
							<tr>
								<th>Mise à prix :</th>
								<td>185 points</td>
							</tr>
							<tr>
								<th>Fin enchères :</th>
								<td>09/10/2018</td>
							</tr>
							<tr>
								<th>Retrait :</th>
								<td></td>
							</tr>
							<tr>
								<th>Vendeur :</th>
								<td>id</td>
							</tr>
							<tr>
								<th>Ma proposition :</th>
								<td><label for="prix-initial"></label>
									<input type="number" id="prix-initial"
									name="tentacles" min="1" max="150"></td>
								<td>
									<button onclick="window.location.href = './MonProfilServlet';"
										type="submit" class="btn btn-primary" data-bs-toggle="button"
										autocomplete="off" aria-pressed="true">Enchérir</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
</div>
<div class="col text-left">
	<button onclick="window.location.href = './MonProfilServlet';"
		type="button" class="btn btn-primary" data-bs-toggle="button"
		autocomplete="off" aria-pressed="true">Back</button>
</div>
</body>
</html>