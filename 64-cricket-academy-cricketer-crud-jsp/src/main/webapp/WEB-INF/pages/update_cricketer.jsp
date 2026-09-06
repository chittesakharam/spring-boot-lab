<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Cricketer</title>
</head>
<body>
    
  <frm:form action="updateCricketer" method="POST" modelAttribute="cricketerVO">
   <table>
    <tr>
     <td> Player Id: </td>
     <td><frm:input type="text" path="playerId" readonly="true"/></td>
    </tr>
    <tr>
     <td> Player Name: </td>
     <td><frm:input type="text" path="playerName"/></td>
    </tr>
    <tr>
     <td> Team Name: </td>
     <td><frm:input type="text" path="teamName"/></td>
    </tr>
    <tr>
     <td> Role : </td>
     <td><frm:input type="text" path="role"/></td>
    </tr>
    <tr>
     <td> Batting Style : </td>
     <td><frm:input type="text" path="battingStyle"/></td>
    </tr>
    <tr>
     <td> Jersey Number : </td>
     <td><frm:input type="text" path="jerseyNumber"/></td>
    </tr>
    <tr>
     <td>  <input type="submit" value="Send"></td>
     <td><input type="reset"  value="Cancel"></td>
    </tr>
   </table>
  </frm:form>
</body>
</html>