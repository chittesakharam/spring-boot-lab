<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

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

<h1>All Books</h1>

<c:choose>
    <c:when test="${not empty bookData.content}">

        <table border="1" cellpadding="5">
            <tr>
                <th>Book ID</th>
                <th>Book Name</th>
                <th>Author Name</th>
                <th>Category</th>
                <th>Price</th>
                <th>Publisher</th>
                <th>Published Date</th>
                <th>Stock Quantity</th>
                <th>Operations</th>
            </tr>

            <c:forEach var="book" items="${bookData.content}">
                <tr>
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.category}</td>
                    <td>${book.price}</td>
                    <td>${book.publisher}</td>
                    <td>${book.publishedDate}</td>
                    <td>${book.stockQuantity}</td>
                    <td>
                        <a href="edit?id=${book.id}">Edit</a>
                        &nbsp;&nbsp;
                        <a href="delete?id=${book.id}"
                           onclick="return confirm('Do you want to delete?')">
                            Delete
                        </a>
                    </td>
                </tr>
            </c:forEach>

        </table>

        <br>

        <p style="text-align:center;">

            <!-- Previous -->
            <c:if test="${bookData.hasPrevious()}">
                <a href="all?page=${bookData.number-1}">Previous</a>
                &nbsp;&nbsp;
            </c:if>

            <!-- First -->
            <c:if test="${!bookData.first}">
                <a href="all?page=0">First</a>
                &nbsp;&nbsp;
            </c:if>

            <!-- Page Numbers -->
            <c:forEach var="i" begin="1" end="${bookData.totalPages}">
                <a href="all?page=${i-1}">${i}</a>
                &nbsp;&nbsp;
            </c:forEach>

            <!-- Last -->
            <c:if test="${!bookData.last}">
                <a href="all?page=${bookData.totalPages-1}">Last</a>
                &nbsp;&nbsp;
            </c:if>

            <!-- Next -->
            <c:if test="${bookData.hasNext()}">
                <a href="all?page=${bookData.number+1}">Next</a>
            </c:if>

        </p>

    </c:when>

    <c:otherwise>
        <h3 style="text-align:center;color:blue;">No Book Found</h3>
    </c:otherwise>

</c:choose>

<h3 style="text-align:center;color:green;">${updateMsg}</h3>
<h3 style="text-align:center;color:red;">${deleteMsg}</h3>
</body>
</html>