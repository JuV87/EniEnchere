<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="fr.eni.enchere.bo.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Mon-Profile</title>
</head>
<body>
	<h1>
		<a href="/HomeConnexionServlet" style="color:#000000;"> ENI - Enchères </a>
	</h1>
	<div class="col text-center">
		<h2>Mon Profil :</h2>
	</div>
	<div style="padding: 1rem">
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Pseudo :</th>
					<td> ${profil.pseudo}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Nom :</th>
					<td> ${profil.nom}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >prenom :</th>
					<td> ${profil.prenom}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Email :</th>
					<td> ${profil.email}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Mobile :</th>
					<td> ${profil.telephone}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Rue :</th>
					<td> ${profil.rue}</td>
				</tr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Code postal :</th>
					<td> ${profil.codePostal}</td>
				</tr>
			</div>
		</div>
	
	<div class="row">
			<div class="col-sm-3">
				<tr class="mb-0" style="padding: 1rem">
					<th >Ville :</th>
					<td> ${profil.ville}</td>
				</tr>
			</div>
		</div>
	</div>

	<div class="col text-center">
		<button onclick="window.location.href = './ModificationProfileServlet';"
			type="button" class="btn btn-primary" data-bs-toggle="button"
			autocomplete="off" aria-pressed="true">Modifier</button>
	</div>

</body>
</html>