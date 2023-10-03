<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Show All Books</title>
</head>
<body>
<h1>Current books in system</h1>
<table border=1>
    <thead>
    <tr>
        <th>Book Id</th>
        <th>Title</th>
        <th>Number Of Page</th>
        <th>Release Year</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.numberOfPage}"/></td>
            <td><c:out value="${book.releaseYear}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<%--<c:forEach items="${books}" var="book">--%>
<%--    <tr>--%>
<%--        <td>--%>
<%--                ${book.id}--%>
<%--        </td>--%>
<%--        <td>--%>
<%--                ${book.numberOfPage}--%>
<%--        </td>--%>
<%--        <td>--%>
<%--                ${book.title}--%>
<%--        </td>--%>
<%--        <td>--%>
<%--                ${book.releaseYear}--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--    <br/>--%>
<%--</c:forEach>--%>
</body>
</html>