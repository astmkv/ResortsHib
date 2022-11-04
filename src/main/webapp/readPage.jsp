<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>READ</title>
</head>
<body>
<h1>READ</h1>
<form action="ReadServlet" method="post">
    <h4>Request:
    </h4>
    <select name="req">
        <option value="all">show all</option>
        <option value="search">search by Id</option>
    </select>
    <input type="text" name="search_field">
    <button> show results </button>

    <table>
        <c:forEach var="resorts" items="${resorts}">
            <tr>
                <td>
                        ${resorts}
                </td>
            </tr>
        </c:forEach>
    </table>

<%--    <div name="resort">${resort}</div>--%>
</form>
</body>
</html>