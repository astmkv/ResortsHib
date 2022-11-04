<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>СПИСОК КУРОРТОВ</h1>
<form action="DBResortServlet" method="post">
    <select name="req">
        <option value="create"> create </option> >
        <option value="read"> read </option> >
        <option value="update"> update </option> >
        <option value="delete"> delete </option> >
    </select>
    <button> GO! </button>
</form>
</body>
</html>