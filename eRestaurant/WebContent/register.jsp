<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<sb:head/>
</head>
<jsp:include page="/pages/header.jsp" />
<body>
	<div class="container">
	<s:form action="addUser" method="post" theme="bootstrap" cssClass="form-horizontal" label="Register">
	    <s:textfield name="user.userId" cssClass="input-sm" elementCssClass="col-sm-6" label="User ID"/>
	    <s:password name="user.password" cssClass="input-sm" elementCssClass="col-sm-6" label="password"/>
	    <div class="form-group">
              <div class="col-sm-offset-3 col-md-9">
                  <s:submit cssClass="btn btn-primary"/>
              </div>
        </div>
	</s:form>
	</div>
</body>
</html>