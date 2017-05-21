<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projeto Arqdsis</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body >
<div class="panel col-md-4 col-md-offset-4">
<h1 class="panel panel-heading">
<c:if test="${ estado.descricao eq '' }">
	Maquina de Doces:
</c:if>
${ estado.descricao }
</h1>
<div class="panel panel-body">

<c:forEach var="opcao" items="${ estado.estadosFuturos }">
	<a href="?valorSelecionado=${ opcao.key }" class="btn btn-primary col-md-4">${ opcao.key.value }</a>
</c:forEach>

</div>
</div>
	<script type="text/javascript" scr="js/npm.js"></script>
	<script type="text/javascript" scr="js/bootstrap.min.js"></script>
</body>
</html>