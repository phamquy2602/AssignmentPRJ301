<%-- 
    Document   : Message.jsp
    Created on : Nov 8, 2023, 6:39:16 PM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta name="description" content="">
        <meta name="author" content="">

        <title>HomePage</title>

        <!-- CSS FILES -->        
        <link rel="preconnect" href="https://fonts.googleapis.com">

        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500;600;700&family=Open+Sans&display=swap" rel="stylesheet">

        <link href="./css/bootstrap.min.css" rel="stylesheet">

        <link href="./css/bootstrap-icons.css" rel="stylesheet">

        <link href="./css/templatemo-topic-listing.css" rel="stylesheet">      

        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            table, th, td {
                border: 1px solid black;
            }

            th, td {
                padding: 10px;
                text-align: left;
            }

            .custom-table {
                /* Ưu tiên cao hơn cho bảng cụ thể */
                width: 80%;
                .edit-link {
                    color: blue; /* Màu mặc định */
                    transition: color 0.3s ease-in-out; /* Hiệu ứng chuyển màu trong 0.3 giây với hiệu ứng dễ dàng */
                }

                .edit-link:hover {
                    color: red; /* Màu khi di chuột qua */
                }

                .edit-link:active {
                    color: green; /* Màu khi nhấp chuột xuống */
                }
            }
        </style>
    </head>
    <html>
        <body id="top">

            <main>
                <!-- header -->
                <nav class="navbar navbar-expand-lg" >
                    <div class="container">
                        <a class="navbar-brand" href="home">
                            <img src="https://www.goabroad.com/section_cloudinary/gaplabs/image/upload/v1/images2/clients/logos/MAIN/fptcorp-logo-1563325940.jpg" style="height: 110px;width: 100px;" alt="Homepage" />
                        </a>

                        <div class="d-lg-none ms-auto me-4">
                            <a href="#" class="navbar-icon bi-person smoothscroll"></a>
                        </div>

                        <button  class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav ms-lg-5 me-lg-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="#" style="color: orange">profile</a>
                                </li>

                                <li class="nav-item dropdown">
                                    <a  style="color: orange" class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Information Access</a>
                                    <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                        <li><a class="dropdown-item" href="timetable?id=${userId}">Weekly timetable</a></li>
                                        <li><a class="dropdown-item" href="listgroupinstructor?id=${userId}">Attendance Status</a></li>
                                    </ul>
                                </li>



                                <li class="nav-item">
                                    <a style="color: orange" class="nav-link" href="#">Feedback</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a style="color: orange" class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Others</a>
                                    <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                        <li><a class="dropdown-item" href="topics-listing.html">Student Profile</a></li>
                                        <li><a class="dropdown-item" href="contact.html">Update Profile</a></li>
                                        <li><a class="dropdown-item" href="logout">Logout</a></li>
                                    </ul>
                                </li>
                            </ul>

                        </div>
                    </div>
                </nav>
                <html>
                    <head>
                        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                        <title>JSP Page</title>
                    </head>
                    <body>
                        <h2 style="color: orange">Successfull Attendance Check</h2>
                        <a href="timetable?id=${userId}" class="edit-link">Edit Again</a>

                    </body>
                    <footer class="site-footer section-padding">
                        <div class="container">
                            <div class="row">

                                <div class="col-lg-3 col-12 mb-4 pb-2">
                                    <a class="navbar-brand" href="#">
                                        <img src="https://www.goabroad.com/section_cloudinary/gaplabs/image/upload/v1/images2/clients/logos/MAIN/fptcorp-logo-1563325940.jpg" style="height: 110px;width: 100px;" alt="Homepage" />
                                    </a>
                                </div>

                                <div class="col-lg-3 col-md-4 col-6">
                                    © Powered by <a href="http://fpt.edu.vn" target="_blank">FPT University</a>&nbsp;|&nbsp;<a href="http://cms.fpt.edu.vn/" target="_blank">CMS</a>&nbsp;|&nbsp; <a href="http://library.fpt.edu.vn" target="_blank">library</a>&nbsp;|&nbsp; <a href="http://library.books24x7.com" target="_blank">books24x7</a>
                                </div>

                                <div class="col-lg-3 col-md-4 col-6 mb-4 mb-lg-0">
                                    Mọi góp ý thắc mắc xin liên hệ phòng dịch vụ sinh viên Điện thoại: (024)7308.13.13 hoặc Email: fpt.edu.vn

                                </div>

                                <div class="col-lg-3 col-md-4 col-12 mt-4 mt-lg-0 ">
                                    <div class="dropdown">
                                        <p class="copyright-text">Copyright © 2023 Pham Dương Thanh Quý. All rights reserved.
                                    </div>



                                </div>

                            </div>
                        </div>
                    </footer>
                </html>
