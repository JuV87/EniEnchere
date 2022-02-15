<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Title</title>
</head>
<body>

	<h1>ENI - Ench�res</h1>

	<form method="post" action="index">
		<div style="padding: 0.5rem">
			<!-- Input Id -->
			<div class="mb-3">
				<label for="pseudo" class="form-label">Identifiant</label> <input
					type="text" class="form-control" id="pseudo">
			</div>
			<!-- Input Id -->

			<!-- Input Password -->
			<div class="mb-3">
				<label for="inputPassword" class="form-label">Mot de passe</label> <input
					type="password" class="form-control" id="motDePasse">
			</div>
			<!-- Input Password -->
			<br>

			<!-- Bloc connexion -->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">

						<button type="submit" value="Connexion"
							class="btn w-100 btn-primary">Connexion</button>

					</div>
					<div class="col-sm-6">
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="check">
							<label class="form-check-label" for="check">Se souvenir
								de moi</label>
						</div>
						<a href="motDePasseOublie">Mot de passe oubli�</a>
					</div>
				</div>
			<!-- Cr�er un compte -->
			</div>
			<br><br>
			<div>
				<button type="submit" class="btn btn-info btn-lg text-white w-100">Cr�er
					un compte</button>
			</div>
			<!-- Cr�er un compte -->
		</div>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>