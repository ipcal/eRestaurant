<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order</title>
<link rel="stylesheet" href="<s:url value="/styles/step.css" />"
	type="text/css" />
</head>
<body>
	<jsp:include page="/pages/header.jsp" />
	<div class="container">

		<ul class="steps">
			<li class="done"><a href="">Step 1 Booking</a></li>
			<li class="active"><p>Step 2 Order</p></li>
			<li class="undone"><p>Step 3 Confirmation</p></li>
			<li class="undone"><p>Step 4 Finish</p></li>
			<!--<li class="undone"><p>Disabled step</p></li>-->
		</ul>

		<a
			href="<s:url action="order_page"><s:param name="food.menuId" value="1" /></s:url>">Order
			page</a>
		<s:form action="" method="post" theme="bootstrap"
			cssClass="form-horizontal" label="Please select food">
		</s:form>

		<table class="table table-hover">

			<thead>
				<tr>
					<th></th>
					<th>#</th>
					<th>Name</th>
					<th>Description</th>
					<th>Unit Price</th>
					<th>Unit</th>
					<th>Total price</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="foodList" status="food">
					<tr>
						<td><s:checkbox name="" theme="simple"/></td>
						<td><s:property value="%{#food.index+1}" /></td>
						<td><s:property value="foodName" /></td>
						<td><s:property value="description" /></td>
						<td><s:property value="price" /></td>
						<td><s:textfield name="" theme="bootstrap"  elementCssClass="col-sm-4"/></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>