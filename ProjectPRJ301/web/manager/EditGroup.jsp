<%-- 
    Document   : EditGroup
    Created on : Oct 31, 2023, 2:05:20 AM
    Author     : quyde
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit Details</title>
    </head>
    <body>
        <form action="editgroup" method="post">

            <label for="gid">Group ID:</label>
            <input id="gid" name="gid" value="${detail.id}" readonly><br><br>

            <label for="name">Name:</label>
            <input id="name" name="name" value="${detail.name}"><br><br>

            <label for="subject">Subject:</label> 
            <select id="subject" name="subject">
                <c:forEach var="s" items="${listS}">
                    <option value="${s.id}" ${s.id == detail.subject.id ? 'selected' : ''}>
                        ${s.name}
                    </option>
                </c:forEach>
            </select> <br><br>

            <label for="instructor">Instructor:</label>
            <select id="instructor" name="instructor">
                <c:forEach var="i" items="${listI}">
                    <option value="${i.id}" ${i.id == detail.instructor.id ? 'selected' : ''}>
                        ${i.name}  
                    </option>
                </c:forEach>
            </select><br><br>

            <input type="submit" value="Save">

        </form>
    </body>
</html>
