<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Skill Tracker</title>
</head>
<body>
  <h1 style="color:red;text-align:center;"> Welcome To Employee Skill Tracker</h1>
  
  <h4><a href="${pageContext.request.contextPath}/register">Register Employee</a></h4>
  <h4><a href="${pageContext.request.contextPath}/all">View All Employees</a></h4>
  
   <h1 style="color:green;text-align:center;">${resultMsg} </h1>
</body>
</html>