<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<script src="js/login.js"></script>

<style>

table{
    margin:auto;
    margin-top:100px;
    border:1px solid black;
    padding:20px;
}

.error{
    color:red;
}

</style>

</head>
<body>

<center>

<a href="login?lang=en">English</a> |
<a href="login?lang=hi_IN">Hindi</a> |
<a href="login?lang=fr_FR">French</a>

</center>

<br><br>

<form:form modelAttribute="login" method="post">

<table>

<tr>
<td colspan="2" align="center">
<font color="red">
<form:errors/>
</font>
</td>
</tr>

<tr>
<td>
<spring:message code="msg.uname"/>
</td>

<td>
<form:input path="username"/>
<form:errors path="username" cssClass="error"/>
</td>
</tr>

<tr>
<td>
<spring:message code="msg.pass"/>
</td>

<td>
<form:password path="password"/>
<form:errors path="password" cssClass="error"/>
</td>
</tr>

<tr>

<td>
<input type="submit" value="<spring:message code='msg.login'/>"/>

</td>

<td>
<input type="reset" value="<spring:message code='msg.reset'/>"/>
</td>

</tr>

</table>

</form:form>

</body>
</html>