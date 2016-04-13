<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<jsp:include page="/pages/header.jsp" />

<h1>UserName:<s:property value="user.userId" /></h1>
<h1>password:<s:property value="user.password" /></h1>
<h2>You are successful login</h2>

<%=session.getAttribute("name")%>

<h1>UserName:<s:property value="#session.name" /> </h1>
<h1>Date:<s:property value="#session.context" /> </h1>

<br />
<a href="<s:url action="logout"/>">logout</a>


</body>
</html>