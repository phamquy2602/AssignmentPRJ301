<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : ListGroup
    Created on : Oct 30, 2023, 10:55:13 PM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Group</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Group ID</th>
                    <th>Group Name</th>
                    <th>Instructor</th>
                    <th>Subject</th>
                    <th>Function</th> 
                </tr>
            </thead>
            <tbody>
                <c:forEach var="o" items="${requestScope.listG}">
                    <tr>
                        <td>${o.id}</td>
                        <td>${o.name}</td>
                        <td>${o.instructor.name}</td>
                        <td>${o.subject.name}</td>
                        <td> 
                            <button class="" type="button" title="Delete" onclick="showMess(${o.id})">Delete</button>
                            <button class="" type="button" title="edit"> <a href="editgroup?gid=${o.id}" class="btn-link">Edit</a></button>
                        </td>  
                    </tr>


                </c:forEach>
            </tbody>
        </table><br>

        <button onclick="location.href = 'addgroup'" title="Add">
             Add Group
        </button>   
       

        <script>
            function showMess(gid) {
                var option = confirm("Are you sure to delete");
                if (option === true) {
                    window.location.href = 'deletegroup?gid=' + gid;
                }
            }
        </script>
    </body>
</html>




