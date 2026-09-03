<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>

<h1 style="color:red;text-align:center;">Registration Form</h1>
<frm:form action="save"  modelAttribute="emp">
    
  <table>
   <tr>
   <td>Employee Name: </td>
   <td><frm:input type="text" path="employeeName"/></td>
   </tr>
   <tr>
   <td>Skill Name: </td>
   <td><frm:input type="text" path="skillName"/></td>
   </tr>
   <tr>
   <td>Experience : </td>
   <td><frm:input type="text" path="experience"/></td>
   </tr>
   <tr>
   <td>Project Name: </td>
   <td><frm:input type="text" path="projectName"/></td>
   </tr>
   <tr>
   <td><input type="submit" value="Save"></td>
   <td><input type="reset" value="Reset"></td>
   </tr>
      
   
  </table>
   </frm:form>
  
</body>
</html>