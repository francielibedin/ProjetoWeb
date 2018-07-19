<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Produtos</title>
</head>
<body>
	<form action="CadastroProdutoServlet" method="POST">
		<label>Código</label> 
		<input type="number" name="codigo" id="codigo">
		<br>
		<label>Produto</label> 
		<input type="text" name="nome" id="nome">
		<br>
		<label>Fabricante</label> 
		<input type="text" name="fabricante" id="fabricante">
		<br>
		<label>Valor</label> 
		<input type="number" name="valor" id="valor">
		<br>
		<input type="submit" value="Salvar">
		<a href="HomeServlet">Cancelar</a>
	</form>
</body>
</html>