<%--
  Created by IntelliJ IDEA.
  User: astmkv
  Date: 04.11.2022
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>UPDATE</h1>

<form action="UpdateServlet" method="post">
    <div name="id">id</div>
    <input type="text" id="id-field" name="id_field">
    <br>
    <h4>new data:</h4>
    <br>
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
        update resort
    </button>

    <div name="result">${result}</div>
</form>
</body>
</html>
