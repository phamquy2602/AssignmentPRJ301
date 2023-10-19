<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : Oct 14, 2023, 1:56:04 PM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>StudentID</th>
                    <th>StudentName</th>
                    <th>BirthDate</th>
                    <th>ClassName</th>
                    <th>StartDate</th>
                    <th>InstructorName</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="o" items="${list}">
            
                <tr>
                    <td>${o.student.id}</td>
                    <td>${o.student.name}</td>
                    <td>${o.student.dob}</td>
                    <td>${o.name}</td>
                    <td>${o.date}</td>
                    <td>${o.instructors.name}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </body>
</html>
