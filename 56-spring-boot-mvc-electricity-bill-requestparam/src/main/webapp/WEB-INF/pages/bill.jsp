<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

  <form action="bill" method="POST">
   <label>Customer Name: </label> <input type="text" name="cName">
   <label>Units: </label> <input type="text" name="units">
  
   <input type="submit" value="Send"> <input type="reset" value="Cancel">
    
  </form>
  <a href="/">Home</a>
</body>
</html>