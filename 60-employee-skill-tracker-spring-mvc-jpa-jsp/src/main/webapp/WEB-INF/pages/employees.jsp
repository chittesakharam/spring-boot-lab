<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employees</title>

<style>
    table {
        border-collapse: collapse;
        width: 80%;
        margin: auto;
    }

    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: center;
    }

    th {
        background-color: #f2f2f2;
    }

    h1 {
        text-align: center;
        color: red;
    }
</style>
</head>
<body>

<h1>All Employees</h1>

<c:choose>
    <c:when test="${not empty allEmp}">
        <table>
            <tr>
                <th>Employee ID</th>
                <th>Employee Name</th>
                <th>Skill Name</th>
                <th>Experience</th>
                <th>Project Name</th>
                <th>Operations</th>
            </tr>

            <c:forEach var="emp" items="${allEmp}">
                <tr>
                    <td>${emp.employeeId}</td>
                    <td>${emp.employeeName}</td>
                    <td>${emp.skillName}</td>
                    <td>${emp.experience}</td>
                    <td>${emp.projectName}</td>
                   
                </tr>
            </c:forEach>
        </table>
    </c:when>

    <c:otherwise>
        <h3 style="text-align:center; color:blue;">No Employees Found</h3>
    </c:otherwise>
</c:choose>

</body>
</html>