<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="./fragments/header.jsp" />

<body>

<div class="container">

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nombre</th>
            <th>Accion</th>
        </tr>
        </thead>

        <c:forEach var="cancion" items="${listaCanciones}">
            <tr>
                <td>${cancion.nombre}
                </td>
                <td>Accion</td>
            </tr>
        </c:forEach>
    </table>

</div>


</body>
</html>