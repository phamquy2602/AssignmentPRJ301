<%-- 
    Document   : insert.jsp
    Created on : Oct 16, 2023, 4:39:13 PM
    Author     : quyde
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:set var="username" value="${sessionScope.loggedInUser}" />
<html>
    <head>
        <title>Thêm Người Dùng</title>
    </head>
    <body>
        <h1>Hello</h1>
        <form action="insert" method="POST">
            <label for="name">Tên:</label>
            <input type="text" id="name" name="name" required><br><br>

            <label for="gender">Giới tính:</label>
            <input type="radio" id="male" name="gender" value="male" required>
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="female" required>
            <label for="female">Female</label><br><br>

            <label for="dob">Ngày sinh:</label>
            <input type="date" id="dob" name="dob" required><br><br>

            <label for="dept">Phòng ban:</label>
            <select id="dept" name="dept" required>
                <c:forEach items="${listd}" var="o">
                    <option value="${o.id}">${o.name}</option>
                </c:forEach>
            </select><br><br>

            <input type="submit" value="Thêm">
        </form>
    </body>
</html>
