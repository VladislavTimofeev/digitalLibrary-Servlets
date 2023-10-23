<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Adding author</title>
</head>
<body style="background-color: gainsboro">
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<h1>You can add a new author</h1>
<form method="POST">
    First Name :
    <input type="text" name="firstName" required="required" value="<c:out value="${author.firstName}" />"/>
    <br/>

    Last Name :
    <input type="text" name="lastName" required="required" value="<c:out value="${author.lastName}" />"/>
    <br/>

    <input type="submit" value="Submit"/>
</form>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>

