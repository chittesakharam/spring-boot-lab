<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="pass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

  <pass:form action="festival" method="POST" modelAttribute="fPass">
   <label>Pass ID: </label> <pass:input type="text" path="passId"/>
   <label>Visitor Name: </label> <pass:input type="text" path="visitorName"/>
   <label>Nationality: </label> <pass:input type="text" path="nationality"/>
   <label>Festival Category: </label> <pass:input type="text" path="festivalCategory"/>
   <label>Pass Type:</label> <pass:input type="text" path="passType"/>
   <label>Visiting Days: </label> <pass:input type="text" path="visitingDays"/>
   <label>Email: </label> <pass:input type="text" path="email"/>
   <input type="submit"  value="Send"> <input type="reset" value="Cancel" >
    
  </pass:form>
  <a href="./">Home</a>
</body>
</html>