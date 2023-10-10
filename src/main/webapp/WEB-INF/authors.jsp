<%@ page contentType="text/html;charset=windows-1251;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="jsp/author_table_view.jsp" %>
<body>
<div id="main">
    <table class="timecard">
        <caption>Authors</caption>
        <thead>
        <tr>
            <th id="id">Author`s id</th>
            <th id="firstName">First Name</th>
            <th id="lastName">Last Name</th>
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
</div>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>

