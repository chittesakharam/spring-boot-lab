<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Update Form</title>
</head>
<body>

<h1 style="color:red;text-align:center;">Update Book Form</h1>
<frm:form action="update" method="POST" modelAttribute="bookVO">
    
  <table>
   <tr>
   <td>Book Id: </td>
   <td><frm:input type="text" path="id" readonly="true"/></td>
   </tr>
   <tr>
   <td>Book Name: </td>
   <td><frm:input type="text" path="title"/></td>
   </tr>
   <tr>
   <td>Author Name: </td>
   <td><frm:input type="text" path="author"/></td>
   </tr>
   <tr>
   <td>Book Category : </td>
   <td><frm:input type="text" path="category"/></td>
   </tr>
   <tr>
   <td>Book Price: </td>
   <td><frm:input type="text" path="price"/></td>
   </tr>
   <tr>
   <td>Publisher: </td>
   <td><frm:input type="text" path="publisher"/></td>
   </tr>
   <tr>
   <td>Published Date: </td>
   <td><frm:input type="text" path="publishedDate"/></td>
   </tr>
   <tr>
   <td>Stock Quantity: </td>
   <td><frm:input type="text" path="stockQuantity"/></td>
   </tr>
   <tr>
   <td><input type="submit" value="Save"></td>
   <td><input type="reset" value="Reset"></td>
   </tr>
      
   
  </table>
   </frm:form>
</body>
</html>