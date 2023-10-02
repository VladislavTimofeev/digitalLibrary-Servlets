<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>AddBook</title>
</head>
<body>
<h1>Now you can add your book!</h1>
<%--<form action="AddBookServlet" method="POST">--%>
<%--    ID: <input name="id"/>--%>
<%--    <br><br>--%>
<%--    NumberOfPage: <input name="numberOfPage"/>--%>
<%--    <br><br>--%>
<%--    Title: <input name="title"/>--%>
<%--    <br><br>--%>
<%--    ReleaseYear: <input name="releaseYear"/>--%>
<%--    <br><br>--%>
<%--    <input type="submit" value="Submit"/>--%>
<%--</form>--%>
<form method="POST" action='AddBookServlet' name="doPost">
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