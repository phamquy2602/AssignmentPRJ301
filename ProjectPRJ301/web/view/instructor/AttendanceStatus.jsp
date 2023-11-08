<%-- 
    Document   : AttendanceStatus
    Created on : Nov 8, 2023, 5:24:45 PM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance Status</title>
    </head>
    <body>
        
        <form action="attendancestatus" method="GET">
            <input  name="id" value="${userId}"/>
            
            <input type="submit" value="View"/>
        </form>    
            
        
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Student Name</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
            
                <c:forEach var="attendance" items="${lista}">
                    <tr>
                        <td>${attendance.session.id}</td>
                        <td>${attendance.student.name}</td>
                        <td>${attendance.status}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
