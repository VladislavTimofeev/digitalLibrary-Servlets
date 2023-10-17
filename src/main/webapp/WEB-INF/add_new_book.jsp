<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Adding book</title>
</head>
<body style="background-color: gainsboro">
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<h1>Hello and now add your book</h1>
<form method="POST">
    Number Of Page :
    <input type="text" name="numberOfPage" required="required" value="<c:out value="${book.numberOfPage}" />"/>
    <br/>

    Title :
    <input type="text" name="title" required="required" value="<c:out value="${book.title}" />"/>
    <br/>

    Release year :
    <input type="text" name="releaseYear" required="required" value="<c:out value="${book.releaseYear}" />"/>
    <br/>

    <input type="submit" value="Submit"/>
</form>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>
