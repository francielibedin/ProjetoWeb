<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="br.com.praticaweb.model.Produto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>Código</td>
			<td>Produto</td>
			<td>Fabricante</td>
			<td>Valor</td>
		</tr>
		<% ArrayList<Produto> produtos = (ArrayList<Produto>) request.getSession().getAttribute("produto"); %>
		<% for(int i = 0; i < produtos.size(); i++) { %>
			<tr>
				<td><%out.print(produtos.get(i).getCodigo());%></td>
				<td><%out.print(produtos.get(i).getNome());%></td>
				<td><%out.print(produtos.get(i).getFabricante());%></td>
				<td><%out.print(produtos.get(i).getValor());%></td>
			</tr>
		<% } %>
<%-- 		<% for(Produto item : produtos) { %> --%>
<!-- 			<tr> -->
<%-- 				<td><%out.print(item.getCodigo());%></td> --%>
<%-- 				<td><%out.print(item.getNome());%></td> --%>
<%-- 				<td><%out.print(item.getFabricante());%></td> --%>
<%-- 				<td><%out.print(item.getValor());%></td> --%>
<!-- 			</tr> -->
<%-- 		<% } %> --%>
	</table>



</body>
</html>