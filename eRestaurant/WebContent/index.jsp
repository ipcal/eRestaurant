<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurant Registration</title>
</head>
<body>
<h1>Restaurant Registration</h1>
<s:form action="add" method="post">
    <s:textfield name="restaurant.restaurantId" label="restaurantId"/>
    <s:textfield name="restaurant.ownerId" label="ownerId"/>
    <s:submit value="Add Contact" align="center"/>
</s:form>

<h2>Contacts</h2>
<table>
<tr>
    <th>Name</th>
</tr>
<s:iterator value="restaurantList" var="restaurant">
    <tr>
        <td><s:property value="RestaurantId"/>, <s:property value="Name"/> </td>
    </tr> 
</s:iterator>
</table>
</body>
</html>