<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      

  <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/user_login.js"></script>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	


</head>

<body>
  <div class="login">
	<h1>Cancion</h1>

<table>
	<tbody>
	<tr>
		<td>Nombre:</td>
		<td><input type="text" id="cancion" name="u" placeholder="Cancion" required="required" />
		</td>
	</tr>
	<tr>
		<td>Artista:</td>
		<td>    	<input type="text" id="artista" name="u" placeholder="Artista" required="required"  id="artista" /></td>
	</tr>
	<tr>
		<td>Album:</td>
		<td>    	<input type="text"  name="u" placeholder="Album" required="required"  id="album" /></td>
	</tr>
	
	
	
	<tr>
		<td>    <button type="submit" class="btn btn-primary btn-block btn-large"  onclick="registrate()">OK</button></td>
		<td></td>
	</tr>
	</tbody>
</table>
   
    
</div>
</body>
</html>