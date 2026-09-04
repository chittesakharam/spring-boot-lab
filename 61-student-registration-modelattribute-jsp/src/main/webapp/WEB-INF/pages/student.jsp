<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

  <form action="register" method="POST">
   <label>Student ID: </label> <input type="text" name="studentId">
   <label>Student Name: </label> <input type="text" name="studentName">
   <label>Course: </label> <input type="text" name="course">
   <label>Email: </label> <input type="text" name="email">
   <label>Mobile Number: </label> <input type="text" name="mobileNo">
   <input type="submit" value="Send"> <input type="reset" value="Cancel">
    
  </form>
 
</body>
</html>