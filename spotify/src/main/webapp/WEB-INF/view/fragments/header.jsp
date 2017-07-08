<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
    <title>My Spotify</title>
    <spring:url value="/resources/core/css/menu.css" var="menuCss" />
    <spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss" />

    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${menuCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/cerrarSesion" var="cerrarSesion" />

<nav class="navbar navbar-inverse " style="background-color: #424BB2;">
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
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-sidebar-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="bs-sidebar-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">MUSICA<span style="font-size:16px" class="pull-right hidden-xs showopacity glyphicon glyphicon-home"></span></a></li>
                <li style="color:white"><a href="/canciones"><span style="color:white">Canciones</span><span style="font-size:16px;color:white" class="pull-right hidden-xs showopacity  glyphicon glyphicon-music"></span></a></li>
                <li style="color:white"><a href="/albumes"><span style="color:white">Albumes</span><span style="font-size:16px;color:white" class="pull-right hidden-xs showopacity  glyphicon glyphicon-tasks"></span></a></li>
                <li><a href="/artistas"><span style="color:white">Artistas</span><span style="font-size:16px;;color:white" class="pull-right hidden-xs showopacity  glyphicon glyphicon-user"></span></a></li>

                <li class="divider"></li>
                <li ><a href="#">Playlist<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-th-list"></span></a></li>
                <li ><a href="#">Tags<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-tags"></span></a></li>
            </ul>
        </div>
    </div>
</nav>