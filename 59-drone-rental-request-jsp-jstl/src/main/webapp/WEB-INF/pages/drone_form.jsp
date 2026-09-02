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

  <pass:form action="drone" method="POST" modelAttribute="dRequest">
   <label>Request ID: </label> <pass:input type="text" path="requestId"/><br>
   <label>Customer Name: </label> <pass:input type="text" path="customerName"/><br>
   <label>Drone Model: </label> <pass:input type="text" path="droneModel"/><br>
   <label>Rental Purpose: </label> <pass:input type="text" path="rentalPurpose"/><br>
   <label>Rental Duration:</label> <pass:input type="text" path="rentalDuration"/><br>
   <label>Contact Number: </label> <pass:input type="text" path="contactNumber"/><br>
   <label>Pickup Location: </label> <pass:input type="text" path="pickupLocation"/><br>
   <input type="submit"  value="Send"> <input type="reset" value="Cancel" >
    
  </pass:form>
  <a href="./">Home</a>
</body>
</html>