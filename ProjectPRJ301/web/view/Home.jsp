<%-- 
    Document   : Home.jsp
    Created on : Oct 8, 2023, 7:54:02 PM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!Doctype html>
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

        <link href="../css/bootstrap.min.css" rel="stylesheet">

        <link href="../css/bootstrap-icons.css" rel="stylesheet">

        <link href="../css/templatemo-topic-listing.css" rel="stylesheet">      
        
    </head>
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

        .container .row .col-md-4 img {
            width: 100%;
            height: auto;
            object-fit: cover;
        }
    </style>

    <body id="top">

        <main>
            <!-- header -->
            <nav class="navbar navbar-expand-lg" >
                <div class="container">
                    <a class="navbar-brand" href="Home.jsp">
                        <img src="https://www.goabroad.com/section_cloudinary/gaplabs/image/upload/v1/images2/clients/logos/MAIN/fptcorp-logo-1563325940.jpg" style="height: 110px;width: 100px;" alt="Homepage" />
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
                                    <li><a class="dropdown-item" href="topics-listing.html">Student Profile</a></li>
                                    <li><a class="dropdown-item" href="contact.html">Update Profile</a></li>
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
            <h1></h1>
            <h1></h1>
            <h1 style="font-size: medium;color: orange;">List News</h1>

            <div id="ctl00_mainContent_divContent">
                <ul class="white-text">
                    <li><a href="#">05/10/23 15:33 : Thông báo điểm thi kết thúc học phần lần 2 KOR321 học kỳ Fall 2023 <br/></a></li>
                    <li><a href="#">03/10/23 23:29 : Thông báo lịch thi kết thúc học phần lần 1, lần 2 các môn học kết thúc sớm, các môn Võ, Cờ, tiếng anh chuẩn bị half 1 học kỳ Fall 2023 <br/></a></li>
                    <li><a href="#">02/10/23 21:46 : Thông báo điểm thi kết thúc học phần lần 1 và danh sách thi kết thúc học phần lần 2 KOR321 ngày 03/10/2023 <br/></a></li>
                    <li><a href="#">29/09/23 11:40 : Thông báo lịch thi thực hành học kỳ Fall 2023. <br/></a></li>
                    <li><a href="#">29/09/23 08:24 : Khảo sát “Các hành động thúc đẩy 17 mục tiêu phát triển bền vững của sinh viên đại học FPT năm 2023” <br/></a></li>
                    <li><a href="#">27/09/23 15:50 : THÔNG BÁO VỀ QUY ĐỊNH SỬ DỤNG PHÒNG HỌC NHÓM TRONG THƯ VIỆN  <br/></a></li>
                    <li><a href="#">27/09/23 09:18 : [CTSV] - Thông báo Điểm Rèn Luyện Học Kỳ Summer 2023 <br/></a></li>
                    <li><a href="#">22/09/23 21:41 : Thông báo lịch thi kết thúc học phần lần 1 và lần 2 KOR321 học kỳ Fall 2023 <br/></a></li>
                    <li><a href="#">22/09/23 10:01 : V/v Kế hoạch bảo vệ khóa luận tốt nghiệp Học kỳ Summer 2023 chuyên ngành Kinh tế theo hướng Kế hoạch kinh doanh (Biz-plan) Lần 2 <br/></a></li>
                    <li><a href="#">10/08/23 12:29 : V/v Kế hoạch bảo vệ khóa luận tốt nghiệp Học kỳ Summer 2023 chuyên ngành Kinh tế theo hướng Kế hoạch kinh doanh (Biz-plan) và chuyên ngành Kinh doanh quốc tế <br/></a></li>
                </ul><br/>
            </div>

            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <img src="https://th.bing.com/th/id/OIP.si_KMb2sSa1sy-uOAQUz_gHaE8?pid=ImgDet&rs=1" alt="Image 1">
                    </div>
                    <div class="col-md-4">
                        <img src="https://i1.wp.com/raffles-american-school.edu.my/wp-content/uploads/2019/07/DSC04307.jpg?fit=2560%2C1873&ssl=1" alt="Image 2">
                    </div>
                    <div class="col-md-4">
                        <img src="https://i.chungta.vn/2018/05/08/1ky-thi-vao-dh-fpt-145-487x325-2155-7636-1525750917.jpg" alt="Image 3">
                    </div>
                    <div class="col-md-4">
                        <img src="https://i.chungta.vn/2018/05/08/1ky-thi-vao-dh-fpt-145-487x325-2155-7636-1525750917.jpg" alt="Image 3">
                    </div>
                    <div class="col-md-4">
                        <img src="https://i.chungta.vn/2018/05/08/1ky-thi-vao-dh-fpt-145-487x325-2155-7636-1525750917.jpg" alt="Image 3">
                    </div>
                    <div class="col-md-4">
                        <img src="https://i.chungta.vn/2018/05/08/1ky-thi-vao-dh-fpt-145-487x325-2155-7636-1525750917.jpg" alt="Image 3">
                    </div>
                </div>
            </div>
        </main>

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


        <!-- JAVASCRIPT FILES -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery.sticky.js"></script>
        <script src="js/click-scroll.js"></script>
        <script src="js/custom.js"></script>

    </body>
</html>
