<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Main Page</title>
    <%@ include file="/WEB-INF/jsp/header.jsp" %>
    <%@ include file="/WEB-INF/css/button_style.html" %>
</head>
<body style="background-color: gainsboro">

<h1>What you wanna do?</h1>
<div>
    <a href="bookServlet?action=books">Show all books</a>
    <a href="bookServlet?action=add_new_book">Add book</a>
    <a href="authorServlet?action=authors">Show all authors</a>
    <a href="authorServlet?action=add_new_author">Add author</a>
</div>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>