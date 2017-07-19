<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/main.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Communication Connoisseur</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container" id="main-container">

        <div class="row">

            <div class="col-md-3">

              <div class="panel panel-primary">
                <div class="panel-heading">
                  <h3 class="panel-title">Menu</h3>
                </div>
                <div class="panel-body">

                    <div class="list-group">
                      <a href="index.html"><button type="button" class="list-group-item">Login</button></a>
                      <a href="index.html"><button type="button" class="list-group-item">Logout</button></a>
                      <a href="overhoren.html"><button type="button" class="list-group-item">Overhoren</button></a>
                      <a href="voortgang.html"><button type="button" class="list-group-item">Voortangs overzicht</button></a>
                      <a href="wachtwoordwijzigen.html"><button type="button" class="list-group-item">Wachtwoord wijzigen</button></a>
                    </div>

                </div>
              </div>

            </div>

            <div class="col-md-9">

                <div class="panel panel-primary">
                <div class="panel-heading">
                  <h3 class="panel-title">Login</h3>
                </div>
                <div class="panel-body">

                  Login met uw account gegevens.
                  <br /><br />

                  <div class="col-md-6">

                    <div class="input-group">
                      <span class="input-group-addon" id="sizing-addon1">@</span>
                      <input type="text" class="form-control" placeholder="Gebruikersnaam">
                    </div>
                    <br />
                    <div class="input-group">
                      <input type="password" class="form-control" placeholder="Wachtwoord">
                      <span class="input-group-btn">
                        <button class="btn btn-primary" type="button">Login</button>
                      </span>
                    </div><!-- /input-group -->

                  </div>

                </div>
              </div>


            </div>

        </div>

    </div><!-- /.container -->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
