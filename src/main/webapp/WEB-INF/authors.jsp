<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Show All Authors</title>
</head>
<body>
<h1>Current authors in system</h1>
<table border=1>
    <thead>
    <tr>
        <th>Author Id</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td><c:out value="${author.id}"/></td>
            <td><c:out value="${author.firstName}"/></td>
            <td><c:out value="${author.lastName}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
