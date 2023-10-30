<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : AddGroup
    Created on : Oct 31, 2023, 1:49:17 AM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Form Example</title>
    </head>
    <body>
        <form action="addgroup" method="post">
            <label for="groupName">Group Name:</label>
            <input type="text" id="name" name="name"><br><br>

            <label for="subject">Subject:</label>
            <select id="subject" name="subject">
                <c:forEach var="s" items="${listS}">

                    <option value="${s.id}">${s.name}</option>
                </c:forEach>
            </select><br><br>

            <label for="instructor">Instructor:</label>
            <select id="instructor" name="instructor">
                <c:forEach var="i" items="${listI}">
                    <option value="${i.id}">${i.name}</option>
                </c:forEach>
            </select><br><br>

            <input type="submit" value="Submit">
        </form>
    </body>
</html>
