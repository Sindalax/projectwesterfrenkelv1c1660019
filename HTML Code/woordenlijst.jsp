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
                  <h3 class="panel-title">Woordenlijst</h3>
                </div>
                <div class="panel-body">

                  <!-- Table -->
                    <table class="table col-md-4">
                        <thead>
                            <tr>
                                <th>
                                    Woord
                                </th>
                                <th>
                                    Vertaling
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Woord1</td>
                                <td>Vertaling1</td>
                            </tr>
                            <tr>
                                <td>Woord2</td>
                                <td>Vertaling2</td>
                            </tr>
                            <tr>
                                <td>Woord3</td>
                                <td>Vertaling3</td>
                            </tr>
                            <tr>
                                <td>Woord4</td>
                                <td>Vertaling4</td>
                            </tr>
                            <tr>
                                <td>Woord5</td>
                                <td>Vertaling5</td>
                            </tr>
                            <tr>
                                <td>Woord6</td>
                                <td>Vertaling6</td>
                            </tr>

                        </tbody>
                    </table>

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
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
