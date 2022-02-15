<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <link href="ProfilStyle.css" rel="stylesheet">


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
      crossorigin="anonymous"></script>

    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mon Profil</title>
  </head>

  <body>
    <div class="monprofildiv">
      <h1>Mon profil</h1>
      <form>
        <div class="mb-3">
          <label for=" " class="form-label">Pseudo</label>
          <input type="text" class="form-control" id="" aria-describedby="Pseudo">

        </div>
        <div class="mb-3">
          <label for="" class="form-label">Nom</label>
          <input type="text" class="form-control" id="">
        </div>



        <div class="mb-3">
          <label for="" class="form-label">Prenom</label>
          <input type="text" class="form-control" id="">
        </div>



        <div class="mb-3">
          <label for="" class="form-label">Email</label>
          <input type="email" class="form-control" id="">
        </div>


        <div class="mb-3">
          <label for="" class="form-label">Telephone</label>
          <input type="telephone" class="form-control" id="">
        </div>


        <div class="mb-3">
          <label for="" class="form-label">Rue</label>
          <input type="text" class="form-control" id="">
        </div>



        <div class="mb-3">
          <label for="" class="form-label">Code postal</label>
          <input type="text" class="form-control" id="">
        </div>


        <div class="mb-3">
          <label for="" class="form-label">Ville</label>
          <input type="text" class="form-control" id="">
        </div>


        <div class="mb-3">
          <label for="" class="form-label">Mot De Passe </label>
          <input type="password" class="form-control" id="">
        </div>


        <div class="mb-3">
          <label for="" class="form-label">Confirmation</label>
          <input type="password" class="form-control" id="">
        </div>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Credit" aria-label="Credit">
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Last name" aria-label="">
          </div>
        </div>
        <div>
          <button type="button" class="btn btn-primary" data-bs-toggle="button" autocomplete="off">Enregistrer</button>
          <button type="button" class="btn btn-primary " data-bs-toggle="button" autocomplete="off"
            aria-pressed="true">Supprimer mon compte </button>
          <button type="button" class="btn btn-primary" disabled data-bs-toggle="button"
            autocomplete="off">Retour</button>
        </div>
      </form>
    </div>


  </body>

  </html>