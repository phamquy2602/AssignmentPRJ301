<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : test
    Created on : Oct 26, 2023, 8:41:32 PM
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
        <c:forEach var="o" items="${slots}">
                
              ${o.description}

                
    </c:forEach>
    </body>
</html>
