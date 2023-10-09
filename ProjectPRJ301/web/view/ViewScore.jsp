<%-- 
Document   : ViewScore
Created on : Oct 8, 2023, 2:13:47 PM
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
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- CSS FILES -->        
        <link rel="preconnect" href="https://fonts.googleapis.com">

        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500;600;700&family=Open+Sans&display=swap" rel="stylesheet">


        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"><!-- comment -->

        <link href="../css/bootstrap.min.css" rel="stylesheet">

        <link href="../css/bootstrap-icons.css" rel="stylesheet">

        <link href="../css/templatemo-topic-listing.css" rel="stylesheet">
        <title>Student Grade </title>
        <style>

            .navbar-nav .nav-link {
                color: #00cc99;
            }

            .navbar-nav .nav-link:hover,
            .navbar-nav .nav-link:focus {
                color: #ff6633;

            }
            .container .row {
                display: flex;
                flex-wrap: wrap;
            }

            .container .row .col-md-4 {
                flex-basis: 33.33%;
                margin-bottom: 20px;
            }
            .list-group-item a:hover {
                color: red;


            }


            .list-group-item a:hover {
                color: #ff6633;


            }


        </style>
    </head>

    <body>
        <!-- header -->
        <nav class="navbar navbar-expand-lg">
            <div class="container custom-header">
                <a class="navbar-brand" href="Home.jsp">
                    <img src="https://www.goabroad.com/section_cloudinary/gaplabs/image/upload/v1/images2/clients/logos/MAIN/fptcorp-logo-1563325940.jpg" style="height: 110px;
                         width: 100px;" alt="Homepage" />
                </a>

                <div class="d-lg-none ms-auto me-4">
                    <a href="#" class="navbar-icon bi-person smoothscroll"></a>
                </div>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-lg-5 me-lg-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#">profile</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Registration/Application</a>
                            <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                <li><a class="dropdown-item" href="#">Suspend one semester to take repeated course</a></li>
                                <li><a class="dropdown-item" href="#">Suspend one semester</a></li>
                                <li><a class="dropdown-item" href="#">Move out class</a></li>
                                <li><a class="dropdown-item" href="#">Register to improve mark </a></li>
                                <li><a class="dropdown-item" href="#">Send Application</a></li>
                                <li><a class="dropdown-item" href="#">Choose paid items</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Information Access</a>
                            <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                <li><a class="dropdown-item" href="#">Weekly timetable</a></li>
                                <li><a class="dropdown-item" href="#">View exam schedule</a></li>
                                <li><a class="dropdown-item" href="#">View syllabuses</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">reports</a>
                            <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                <li><a class="dropdown-item" href="#">Attendance report</a></li>
                                <li><a class="dropdown-item" href="ViewScore.jsp">ViewScore</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Regulation</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="#">Feedback</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Others</a>
                            <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                <li><a class="dropdown-item" href="#">Student Profile</a></li>
                                <li><a class="dropdown-item" href="#">Update Profile</a></li>
                            </ul>
                        </li>
                    </ul>
                    <div class="d-none d-lg-block">
                        <a href="#top" class="navbar-icon bi-person smoothscroll"></a>
                    </div>
                </div>
            </div>
        </nav>
        <!-- end of header -->
        <div class="container custom-content">
            <div class="row">
                <!-- Dropdown menu cho kỳ học -->
                <div class="col-md-3">
                    <h4>Semester</h4>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">Spring 2023</a></li>
                        <li class="list-group-item"><a href="#">Summer 2023</a></li>
                        <li class="list-group-item"><a href="#">Fall 2023</a></li>
                    </ul>
                </div>
                <!-- Danh sách các môn học -->
                <div class="col-md-3">
                    <h4>Subjects</h4>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">Internet of Things (IOT102)</a></li>
                        <li class="list-group-item"><a href="#">Elementary Japanese 1-A1.2 (JPD123)</a></li>
                        <li class="list-group-item"><a href="#">Statistics and Probability (MAS291)</a></li>
                        <li class="list-group-item"><a href="#">Java Web Application Development (PRJ301)</a></li>
                        <li class="list-group-item"><a href="#">Introduction to Software Engineering (SWE201c)</a></li>
                    </ul>
                </div>
                <!-- Bảng điểm -->
                <div class="col-md-6">
                    <h4>Grades</h4>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>GRADE ITEM</th>
                                <th>WEIGHT</th>
                                <th>VALUE</th>
                                <th>COMMENT</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Assignment</td>
                                <td>20%</td>
                                <td>5</td>
                                <td></td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>PT1</td>
                                <td>10%</td>
                                <td>5</td>
                                <td></td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>PT2</td>
                                <td>10%</td>
                                <td>5</td>
                                <td></td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>FE</td>
                                <td>30%</td>
                                <td>5</td>
                                <td></td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>PE</td>
                                <td>30%</td>
                                <td>5</td>
                                <td></td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td colspan="4">Average</td>
                                <td>5.0</td>
                            </tr>
                            <tr>
                                <td colspan="4">Status</td>
                                <td style="color: green">Pass</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <!-- start footer -->
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

                            <div class="col-lg-3 col-md-4 col-12 mt-4 mt-lg-0 ms-auto">
                                <div class="dropdown">
                                    <p class="copyright-text">Copyright © 2023 Pham Dương Thanh Quý. All rights reserved.

                                </div>



                            </div>

                        </div>
                    </div>
                </footer>
                <!-- end footer -->


                <!-- JAVASCRIPT FILES -->
                <script src="js/jquery.min.js"></script>
                <script src="js/bootstrap.bundle.min.js"></script>
                <script src="js/jquery.sticky.js"></script>
                <script src="js/click-scroll.js"></script>
                <script src="js/custom.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
                <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

                </body>

                </html>

