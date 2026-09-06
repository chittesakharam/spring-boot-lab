<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Cricketers</title>

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

<h1>All Cricketers </h1>

<c:choose>
    <c:when test="${not empty cricketers}">
        <table>
            <tr>
                <th>Player ID</th>
                <th>Player Name</th>
                <th>Team Name</th>
                <th>Role </th>
                <th>Batting Style </th>
                <th>Jersey Number</th>
              
                <th>Operations </th>
            </tr>

            <c:forEach var="player" items="${cricketers}">
                <tr>
                    <td>${player.playerId}</td>
                    <td>${player.playerName}</td>
                    <td>${player.teamName}</td>
                    <td>${player.role}</td>
                    <td>${player.battingStyle}</td>
                    <td>${player.jerseyNumber}</td>
                    
                   <td><a href="editCricketer?playerId=${player.playerId}"> Edit</a>
                       <a href="deleteCricketer?playerId=${player.playerId} "  onclick="return confirm('Are you sure you want to delete this player?');"> Delete</a>
                    </td>
                  
                </tr>
            </c:forEach>
        </table>
    </c:when>

    <c:otherwise>
        <h3 style="text-align:center; color:blue;">No Employees Found</h3>
    </c:otherwise>
</c:choose>
  <h1>${updateMsg}</h1>
  <h1>${deleteMsg}</h1>
</body>
</html>