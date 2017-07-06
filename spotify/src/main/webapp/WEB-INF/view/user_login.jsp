<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


    <link rel="stylesheet" type="text/css" href="css/style.css">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/user_login.js"></script>


</head>

<body>
<div class="login">
    <h1>Login</h1>
    <spring:url value="/login" var="loginAction" />

    <form:form method="POST" modelAttribute="userForm" action="${loginAction}">
        <form:input path="nickname" type="text" id="nickname" name="u" placeholder="Username" required="required"/>
        <form:input path="password" type="password" id="password" name="p" placeholder="Password" required="required"/>
        <button type="submit" class="btn btn-primary btn-block btn-large" >Ingresar</button>
    </form:form>
</div>

</body>
</html>