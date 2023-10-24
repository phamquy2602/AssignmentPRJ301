<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : login
    Created on : Sep 27, 2023, 2:25:33 PM
    Author     : sonnt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Classy Login form Widget Flat Responsive Widget Template :: w3layouts</title>
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <!-- for-mobile-apps -->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
        <meta name="keywords" content="Classy Login form Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <!-- //for-mobile-apps -->
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!--header start here-->
        <div class="header">
            <div class="header-main">
                <h1>Login Here</h1>
                <div class="header-bottom">
                    <div class="header-right w3agile">

                        <div class="header-left-bottom agileinfo">

                            <form action="login" method="post">
                                <input type="text"  value="Username" name="username" onfocus="this.value = '';" onblur="if (this.value == ''; ) {this.value = 'User name'; }" required=""/>
                                <input type="password"  value="Password" name="password" onfocus="this.value = '';" onblur="if (this.value == ''; ) {this.value = 'password'; }" required=""/>
                                <div class="remember">
                                    <span class="checkbox1">
                                        <label class="checkbox"><input type="checkbox" name="remember" checked=""><i> </i>Remember me</label>
                                    </span>
                                    <!--						 <div class="forgot">
                                                                                            <h6><a href="#">Forgot Password?</a></h6>
                                                                                     </div>-->
                                    <div class="clear"> </div>
                                </div>

                                <input type="submit" value="Login">
                            </form>	
                            <div class="error-message" >
                                <c:if test="${not empty errorMessage}">
                                    <p style="margin-top: 50px; color: #ffffff">${errorMessage}</p>
                                </c:if>
                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
        <!--header end here-->
        <div class="copyright">
            <p><img src="data:image/png;base64,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" alt="Tên Mô Tả"></p>
        </div>
        <!--footer end here-->


    </body>

</html>
