<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<%@ include file = "/WEB-INF/jsp/header.jsp" %>
<%@ include file = "/css/header.css" %>
<header>
    <h1>What you wanna do?</h1>
    <nav>
        <ul>
            <li><a href="bookServlet?action=books">Show all books</a>
            <li><a href="bookServlet?action=add_new_book">Add book</a>
            <li><a href="authorServlet?action=authors">Show all authors</a>
            <li><a href="authorServlet?action=add_new_author">Add author</a>
        </ul>
    </nav>
</header>
<%@ include file = "/WEB-INF/jsp/footer.jsp" %>
<footer>
    <p>Copyright ©
        <time datetime="2023">2023</time>
        By Engineering team
    </p>
    <address>New Mexico, USA.</address>
</footer>
</body>
</html>