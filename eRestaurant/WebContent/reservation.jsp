<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation</title>
<link rel="stylesheet" href="<s:url value="/styles/step.css" />"
	type="text/css" />
</head>
<body>
	<jsp:include page="/pages/header.jsp" />
	<div class="container">
		<ul class="steps">
			<li class="active"><a href="">Step 1 Booking</a></li>
			<li class="undone"><p>Step 2 Order</p></li>
			<li class="undone"><p>Step 3 Confirmation</p></li>
			<li class="undone"><p>Step 4 Finish</p></li>
			<!--<li class="undone"><p>Disabled step</p></li>-->
		</ul>

		<s:form action="add_reservation" method="post" theme="bootstrap"
			cssClass="form-horizontal" label="Personal Information">
			<s:hidden name="" value="%{#session.name}" />
			<s:textfield name="" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Name" />
			<s:textfield name="" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Phone Number" />
			<s:textfield name="" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Email" />
			<s:textfield name="" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Address" />
		<legend>Reservation</legend>
			<s:textfield name="reservation.numberOfPeople" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Number of People" />
			<sj:datepicker parentTheme="bootstrap" label="Date"
				cssClass="form-control" elementCssClass="col-sm-6" showOn="focus"
				inputAppendIcon="calendar" name="reservation.reserDate" />
			<sj:datepicker name="reservation.reserTime" cssClass="form-control" 
			timepicker="true" timepickerOnly="true"  timepickerFormat="hh:mm"
				elementCssClass="col-sm-6" label="Time" />
			<s:textfield name="reservation.tableId" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Table Number" />
			<s:textarea  name="reservation.remark" cssClass="input-sm"
				elementCssClass="col-sm-6" label="Remark" rows="3"/>
			<div class="form-group">
				<div class="col-sm-offset-3 col-md-9">
					<s:submit cssClass="btn btn-primary" />
				</div>
			</div>
		</s:form>
	</div>


</body>
</html>