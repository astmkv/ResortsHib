<%--
  Created by IntelliJ IDEA.
  User: astmkv
  Date: 03.11.2022
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>CREATE</title>
</head>
<body>
<h1>CREATE</h1>
<form action="CreateServlet" method="post">
    <label>
        name
        <input type="text" id="name-field" name="name_field">
    </label>
    <label>
        country
        <input type="text" id="country-field" name="country_field">
    </label>
    <label>
        season
        <input type="text" id="season-field" name="season_field">
    </label>
    <label>
        price
        <input type="text" id="price-field" name="price_field">
    </label>
    <button>
        create resort
    </button>

<%--    <div name="result">${result}</div>--%>
</form>
</body>
</html>
