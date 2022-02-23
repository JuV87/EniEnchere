<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login Title</title>
    </head>

    <body>

        <h1>ENI - Enchères</h1>
        <!-- action c'est l'URL de la servlet -->
	<div style="padding: 0.5rem">
		<!-- Input Id -->
		<form method="post" action="LoginServlet">
			<div class="mb-3 text-align:center">
				<label for="pseudo" class="form-label">Mail</label> <input
					type="email" class="form-control" name="email">
			</div>
			<!-- Input Id -->

			<!-- Input Password -->
			<div class="mb-3 text-align:center">
				<label for="password" class="form-label">Mot de passe</label> <input
					type="password" class="form-control" name="password">
			</div>
			<div>
				<button type="submit" class="btn w-100 btn-primary">Connexion</button>
			</div>
			<!-- Input Password -->
			<br>
			<!-- Bloc connexion -->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="check">
							<label class="form-check-label" for="check">Se souvenir
								de moi</label>
						</div>
					</div>
					<div class="col-sm-6">
						<div>
							<a href="/EniEnchereWeb/MotDePasseOublieServlet">Mot de passe
								oublié</a>
						</div>
					</div>
					<!-- Créer un compte -->

				</div>
			</div>

			<br>
			<div class="form-group">
				<a href="/EniEnchereWeb/MonProfilServlet"
					class="btn w-100 btn-lg btn-primary">Créer un compte</a>
			</div>
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    </body>

    </html>