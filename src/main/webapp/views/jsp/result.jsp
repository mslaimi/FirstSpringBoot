<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="java.util.ArrayList , com.example.demo.model.Personne" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<Personne> al = (ArrayList<Personne>) request.getAttribute("tab");
	for (Personne p : al) {
		out.print("Hello " + p.getNom() + " " + p.getPrenom());
	}
	%>
</body>
</html>