<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Rezervacija</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 100%;
            max-width: 600px;
            margin: auto;
            border-collapse: collapse;
        }
        td {
            padding: 10px;
        }
        .error {
            color: red;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            border: none;
            cursor: pointer;
            width: 100%;
        }
        input[type="submit"]:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
<h1>Rezervacija</h1>

<form method="POST" action="/submit">
    <table>
        <tr>
            <td>Ime:</td>
            <td><input path="name" /></td>
            <td><errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Prezime:</td>
            <td><input path="surname" /></td>
            <td><errors path="surname" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input path="email" /></td>
            <td><errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Rezerviši" />
            </td>
        </tr>
    </table>
</form>

</body>
</html>
