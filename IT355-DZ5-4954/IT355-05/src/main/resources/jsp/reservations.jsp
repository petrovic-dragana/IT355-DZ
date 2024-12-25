<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Car List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        .button-container {
            display: flex;
            justify-content: space-between;
        }
        .button-container button {
            padding: 6px 12px;
            border: none;
            background-color: #4CAF50;
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin: 4px 2px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h1>Car List</h1>
<h2><button onclick="window.location.href='/cars/reservation'">Show reservations</button></h2>
<table>
    <thead>
    <tr>
        <th>Mark</th>
        <th>Model</th>
        <th>Mileage</th>
        <th>Engine</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="reservation" items="${reservations}">
        <tr>
            <td>${reservation.user.name}</td>
            <td>${reservation.user.surnamename}</td>
            <td>${reservation.user.email}</td>
            <td>${reservation.car.mark}</td>
            <td>${reservation.car.model}</td>
            <td>${reservation.car.milage}</td>
            <td>${reservation.car.engine}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
