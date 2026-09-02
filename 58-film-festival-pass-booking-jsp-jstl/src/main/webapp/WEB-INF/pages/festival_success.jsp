<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Festival Pass Result</title>
</head>
<body>

  <h1>Festival Pass Details: </h1>
  <h3>
  <label>Pass ID: ${fPass.passId} </label> <br>
   <label>Visitor Name: ${fPass.visitorName}</label><br>
   <label>Nationality: ${fPass.nationality}</label> <br>
   <label>Festival Category: ${fPass.festivalCategory}</label> <br>
   <label>Pass Type:${fPass.passType}</label> <br>
   <label>Visiting Days: ${fPass.visitingDays}</label><br>
   <label>Email: ${fPass.email}</label> <br>
  </h3>
 <a href="./"> <h4>Home</h4></a>
</body>
</html>