<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<sj:head/>
<sb:head />

 <link rel="stylesheet" href="<s:url value="/styles/bootstrap-bootswatch.css" />" type="text/css"/>
 <link rel="stylesheet" href="<s:url value="/styles/main.css" />" type="text/css"/>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp">E-Restaurant</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
        	<ul class="nav navbar-nav navbar-right">
        		<s:if test="#session.name==null">
		            <li><a class="btn" href="login.jsp" role="button">Login</a></li>
		            <li><a class="btn" href="register.jsp" role="button">Register</a></li>
	            </s:if>
	            <s:else>
					    <li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
				          	Hello,<s:property value="#session.name" /> <span class="caret"></span>
				          </a>
				          <ul class="dropdown-menu">
				            <li><a href="<s:url action="Acc_Set_page"><s:param name="user.userId" value="#session.name" /></s:url>">Account Settings</a></li>
				            <li><a href="#">Another action</a></li>
				            <li><a href="#">Something else here</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">Separated link</a></li>
				          </ul>
				        </li>
					    <li><a class="btn" href="<s:url action="logout"/>">Logout</a></li>
				</s:else>
        	</ul>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
</body>
</html>