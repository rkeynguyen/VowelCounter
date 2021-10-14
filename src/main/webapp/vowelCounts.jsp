<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<h1>Vowel Counter</h1>
	<form action="countVowels" method="get">
		<table>
			<tr>
				<td>
					<h2>Enter Text:</h2>
				</td>
			</tr>
			<tr>
				<td><textarea cols="40" rows="5" name="text" id="text">${param.text}</textarea></td>
			</tr>
			<tr>
				<td><button type="submit" name="action" value="count">Count</button></td>
			</tr>
		</table>
	</form>

	<c:choose>
		<c:when test="${count != null}">
			<h2>Vowel Count:</h2>
			<table border="1">
				<tr>
					<td>a</td>
					<td>e</td>
					<td>i</td>
					<td>o</td>
					<td>u</td>
				</tr>
				<tr>
					<td>${count[0]}</td>
					<td>${count[1]}</td>
					<td>${count[2]}</td>
					<td>${count[3]}</td>
					<td>${count[4]}</td>
				</tr>
			</table>
		</c:when>
	</c:choose>
</body>
</html>
