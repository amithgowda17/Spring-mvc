<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page isELIgnored="false" %>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Show Trainees</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>

    <table border="2" class="table table-primary">

        <tr>
            <th>Sl No</th>
            <th>Trainee Name</th>
            <th>Trainee Email</th>
        </tr>

        <tr>
            <c:forEach items="${trainees}" var="dto">

            <tr>
                <td>${dto.id}</td>
                <td>${dto.name}</td>
                <td>${dto.email}</td>
            </tr>
            </c:forEach>
        </tr>


    </table>

</body>
</html>