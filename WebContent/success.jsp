<!DOCTYPE html>
<html lang="en">
<head>
  <title>CricOne|Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="homePage.jsp">CricOne</a>
    </div>
 <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Players <span class="caret"></span></a>
        	<ul class="dropdown-menu" >
	          <li><a href="searchPlayers.jsp">Search Player</a></li>
	          <li><a href="searchByCountry.jsp">Search Players By Country</a></li>
	          <li><a href="addPlayer.jsp">Add a New Player</a></li>
	          <li><a href="getAllPlayers">All Players</a></li>
	        </ul>
        </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Leagues <span class="caret"></span></a>
        	<ul class="dropdown-menu" >
        	 <li><a href="leagues">Current Leagues</a></li>
	         <li><a href="addLeagues.jsp">Add Leagues</a></li>
	        </ul>
        </li>
        
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Country <span class="caret"></span></a>
        	<ul class="dropdown-menu" >
	          <li><a href="countries">Countries List</a></li>
	          <li><a href="addCountry.jsp">Add Country</a></li>
	          <li><a href="#">Delete Country</a></li>
	        </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="leagues">Current Leagues</a></p>
      <p><a href="#">Current Matches</a></p>
      <p><a href="searchPlayers.jsp">Find Player by Name</a></p>
      <p><a href="searchByCountry.jsp">Find Players by Country</a></p>
      <p><a href="countries">Countries List</a></p>
    </div>
    <div class="col-sm-8 text-left"> 
      <h1>Welcome</h1>
      <p>This is CricOne. Your own cricket database. </p>
      <hr>
      <h3>SUCCESS!!!</h3>
      <p>Data Updated Successfully...</p>
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p>Trending batsmen</p>
        <img src="images/virat-kohli.png" alt="Kohli" height="55" width="55">
        <img src="images/kevin-pietersen.png" alt="Kevin Peterson" height="45" width="45">
        <img src="images/ms-dhoni.png" alt="MSD" height="45" width="45">
      </div>
      <div class="well">
        <p>Trending Teams</p>
        <img src="images/Indialogo.png" alt="India" height="48" width="48">
        <img src="images/Australia_Logo.png" alt="AUS" height="42" width="35">
        <img src="images/newzealandg.png" alt="NZ" height="45" width="45">  
      </div>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>&copy; 2017 CricOne.com<p>
</footer>

</body>
</html>
