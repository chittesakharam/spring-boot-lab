<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rental Result</title>
</head>
<body>

  <h1>Rental Request Details: </h1>
  <h3>
   <label>Request ID: ${dRequest.requestId }</label> <br>
   <label>Customer Name: ${dRequest.customerName}</label> <br>
   <label>Drone Model: ${dRequest.droneModel}</label> <br>
   <label>Rental Purpose: ${dRequest.rentalPurpose}</label> <br>
   <label>Rental Duration: ${dRequest.rentalDuration}</label> <br>
   <label>Contact Number: ${dRequest.contactNumber}</label> <br>
   <label>Pickup Location: ${dRequest.pickupLocation}</label><br>
  </h3>
 <a href="./"> <h4>Home</h4></a>
</body>
</html>