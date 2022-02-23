
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>Mot de passe oublié</title>
</head>
<body>
    <!------ Include the above in your HEAD tag ---------->
    <div class="form-gap"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                            <h3>
                                <i class="fa fa-lock fa-4x"></i>
                            </h3>
                            <br>
                            <h2 class="text-center">Mot de passe oublié ?</h2>
                            <br>
                            <p>Vous pouvez réinitialiser votre mot de passe ici :</p>
                            <div class="panel-body">
                                <form id="register-form" role="form" autocomplete="off"
                                    class="form" method="post">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i
                                                class="glyphicon glyphicon-envelope color-blue"></i></span> <input
                                                id="email" name="email" placeholder="votre adresse mail"
                                                class="form-control" type="email">
                                        </div>
                                    </div>
                                    <br>
                                    <div class="form-group">
                                        <input name="recover-submit"
                                            class="btn btn-lg btn-primary btn-block"
                                            value="Réinitialiser le mot de passe" type="submit">
                                    </div>
                                    <input type="hidden" class="hide" name="token" id="token"
                                        value="">
                                        <br>
                                        <div class="form-group">
                                        <a href="/EniEnchereWeb/HomeServlet" class="btn btn-lg btn-primary btn-block">Retour</a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
</body>
</html>