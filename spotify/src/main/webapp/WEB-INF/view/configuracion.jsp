<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">

	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="./js/user_login.js"></script>

</head>

<jsp:include page="./fragments/header.jsp" />
<body>

<div class="container">

      <div class="login">
	<h1 id="id" >${userSession.nickname}</h1>

<table>
	<tbody>
	<tr>
		<td>Cambiar nickname:</td>
		<td><input type="text" id="nickname" name="u" placeholder="Cancion" required="required" />
		</td>
	</tr>
	<tr>
		<td>Cambiar contraseña:</td>
		<td>    	<input type="text" id="password" name="u" placeholder="Artista" required="required"  id="artista" /></td>
	</tr>
	<tr>
		<td>Cambiar e-mail:</td>
		<td>    	<input type="text"  name="u" placeholder="Album" required="required"  id="email" /></td>
	</tr>
	
	<tr>
		<td>Cambiar lenguaje:</td>
		<td>    	<input type="text"  name="u" placeholder="Album" required="required"  id="lenguaje" /></td>
	</tr>
	
	
	<tr>
		<td>Desactivar cuenta:</td>
		<td>  <button type="submit" class="btn btn-primary btn-block btn-large"  onclick="desactivar();">Desactivar cuenta</button></td>
		
	</tr>
	
	
	
	<tr>
		<td>    <button type="submit" class="btn btn-primary btn-block btn-large"  onclick="configuracion()">OK</button></td>
		<td></td>
	</tr>
	</tbody>
</table>
   
    
</div>

</div>


</body>
</html>