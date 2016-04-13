<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Setting</title>

</head>
<body>
	<jsp:include page="/pages/header.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Account Setting</li>
						<li><a href="<s:url action="Acc_Set_page"><s:param name="user.userId" value="#session.name" /></s:url>">Personal Information</a></li>
						<s:url var="vertical_url" action="vertical" />
						<li><a href="<s:url action="changepw_page"><s:param name="user.userId" value="#session.name" /></s:url>">Change Password</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-9">
				<s:actionmessage theme="bootstrap" />
				<s:form action="update_user" method="post" theme="bootstrap" cssClass="form-horizontal" label="Personal Information">
					<s:hidden name="user.userId" value="%{#session.name}" />
				    <s:textfield value="%{#session.name}" cssClass="input-sm" elementCssClass="col-sm-6" label="User ID" disabled="true"/>
					<s:textfield name="user.name" cssClass="input-sm" elementCssClass="col-sm-6" label="Name"/>
					<s:textfield name="user.phoneNumber" cssClass="input-sm" elementCssClass="col-sm-6" label="Phone Number"/>
					<s:textfield name="user.email" cssClass="input-sm" elementCssClass="col-sm-6" label="Email"/>
					<sj:datepicker
                        parentTheme="bootstrap"
                        label="Birthday"
                        cssClass="form-control"
                        elementCssClass="col-sm-6"
                        showOn="focus"
                        inputAppendIcon="calendar"
                        name="user.birthday"
                	/>
					<s:radio
                        label="Gender"
                        list="{'F', 'M'}"
                        labelposition="inline"
                        name="user.gender"
                        cssErrorClass="foo"/>
					<s:textfield name="user.address" cssClass="input-sm" elementCssClass="col-sm-6" label="Address"/>
				    <div class="form-group">
			              <div class="col-sm-offset-3 col-md-9">
			                  <s:submit cssClass="btn btn-primary"/>
			              </div>
			        </div>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>