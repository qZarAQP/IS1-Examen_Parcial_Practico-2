<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
    <title>Admin Spotify</title>
    <spring:url value="/resources/core/css/menu.css" var="menuCss" />
    <spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss" />

    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${menuCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/cerrarSesion" var="cerrarSesion" />

<nav class="navbar navbar-inverse ">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${urlHome}">My Spotify</a>
        </div>
        <div id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#">${userSession.nickname}</a></li>
                <li class="active"><a href="${cerrarSesion}">Cerrar sesion</a></li>
            </ul>
        </div>
    </div>
</nav>

<nav class="navbar navbar-default sidebar" style="background-color: #424BB2;" role="navigation">
    <div class="container-fluid">


    </div>
</nav>