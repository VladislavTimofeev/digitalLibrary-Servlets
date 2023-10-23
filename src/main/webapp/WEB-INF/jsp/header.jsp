<%--
  Created by IntelliJ IDEA.
  User: Uladzislau
  Date: 10/6/2023
  Time: 3:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <style type="text/css">
        <%@ include file="/WEB-INF/css/header_style.css" %>
        <%@ include file="/WEB-INF/css/button_style.html" %>
    </style>
</head>
<body>
<header class="header">
    <div>
        <a href="mainServlet?action=index">Main page</a>
        <a href="bookServlet?action=books">Show all books</a>
        <a href="bookServlet?action=add_new_book">Add book</a>
        <a href="authorServlet?action=authors">Show all authors</a>
        <a href="authorServlet?action=add_new_author">Add author</a>
    </div>
</header>
</body>
</html>
