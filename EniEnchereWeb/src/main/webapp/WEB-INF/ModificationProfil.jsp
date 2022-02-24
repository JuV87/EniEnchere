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

<link href="ProfilStyle.css" rel="stylesheet">


<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mon Profil</title>
</head>
<body>
	<h1>
		<a href="/HomeConnexionServlet"> ENI - Enchères </a>
	</h1>
	<div class="col text-center">
		<h2>Mon Profil</h2>
	</div>
	<form method="post" action="ModificationProfileServlet">
		<!-- Input : Pseudo -->
		<div style="padding: 1rem">
			<div class="row">
				<div class="col-sm-3">
					<div class="mb-3">
						<label for="eech-pseudo" class="form-label">Pseudo</label> <input
							type="text" id="eech-pseudo" name="pseudo" class="form-control" value="${profil.pseudo}" >
					</div>
					<!-- ./Input : Pseudo -->

					<!-- Input : Nom -->
					<div class="mb-3">
						<label for="eech-nom" class="form-label">Nom</label> <input
							type="text" id="eech-nom" name="name" class="form-control" value="${profil.nom}">
					</div>
					<!-- ./Input : Nom -->

					<!-- Input : Prenom -->
					<div class="mb-3">
						<label for="" class="form-label">Prenom</label> <input type="text"
							name="prenom" class="form-control" value="${profil.prenom}">
					</div>
					<!-- ./Input : Prenom -->

					<!-- Input : Email -->
					<div class="mb-3">
						<label for="" class="form-label">Email</label> <input type="text"
							name="email" class="form-control" value="${profil.email}">
					</div>
					<!-- ./Input : Email -->

					<!-- Input : Telephone -->
					<div class="mb-3">
						<label for="" class="form-label">Telephone</label> <input
							type="text" name="phone" class="form-control" value="${profil.telephone}">
					</div>
					<!-- ./Input : Telephone -->

					<!-- Input : Rue -->
					<div class="mb-3">
						<label for="" class="form-label">Rue</label> <input type="text"
							name="rue" class="form-control" value="${profil.rue}">
					</div>
					<!-- ./Input : Rue -->

					<!-- Input : Code postale -->
					<div class="mb-3">
						<label for="" class="form-label">Code postale</label> <input
							type="text" name="codePostale" class="form-control" value="${profil.codePostal}">
					</div>
					<!-- ./Input : Code postale -->

					<!-- Input : City -->
					<div class="mb-3">
						<label for="eech-citycode" class="form-label">Ville</label> <input
							type="text" id="eech-citycode" name="city" class="form-control" value="${profil.ville}">
					</div>
					<!-- ./Input : City Code -->

					<!-- Input : Mot de passe -->
					<div class="mb-3">
						<label for="eech-password" class="form-label">Mot de passe</label>
						<input type="password" id="eech-password" name="password"
							class="form-control" value="${profil.motDePasse}">
					</div>
					<!-- ./Input : Mot de passe -->

					<!-- Input : Mot de passe confirmation -->
					<div class="mb-3">
						<label for="eech-password-confirm" class="form-label">Mot de passe confirmation</label> 
						<input type="password" id="eech-password-confirm" name="password-confirm"
								class="form-control" value="${profil.motDePasse}">
					</div>
					<div style="padding: 1rem">
						<div class="row">
							<div class="col-sm-3">
								<tr class="mb-0" style="padding: 1rem">
									<th>Credit :</th>
									<td>${profil.credit}</td>
								</tr>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- ./Input : Mot de passe confirmation -->

		<!-- Buttons  -->
		<div class="d-grid gap-1 d-flex">
			<button type="submit" class="btn w-10 btn-primary">Enregister</button> 
			<input type="submit"class="btn btn-primary col-5" value="Supprimer mon compte">
			<a href="/EniEnchereWeb/HomeConnexionServlet" class="btn w-10 btn-lg btn-primary">Retour</a>												
		</div>
	</form>
</body>
</html>