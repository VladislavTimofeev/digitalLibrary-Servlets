<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Books</title>
</head>
<body>
<h1>Hello Books</h1>
<c:forEach items="${books}" var="book">
    <tr>
        <td>
                ${book.id}
        </td>
        <td>
                ${book.numberOfPage}
        </td>
        <td>
                ${book.title}
        </td>
        <td>
                ${book.releaseYear}
        </td>
    </tr>
</c:forEach>
<h1>Hello and now add your book</h1>
<form method="POST" action='BookServlet' name="doPost">
    Book ID : <input type="text" readonly="readonly" name="id"
                     value="<c:out value="${book.id}" />" /> <br />
    Number Of Page : <input
        type="text" name="numberOfPage"
        value="<c:out value="${book.numberOfPage}" />" /> <br />
    Title : <input
        type="text" name="title"
        value="<c:out value="${book.title}" />" /> <br />
    Release year : <input type="text" name="releaseYear"
                          value="<c:out value="${book.releaseYear}" />" /> <br /> <input
        type="submit" value="Submit" />
</form>
</body>
</html>