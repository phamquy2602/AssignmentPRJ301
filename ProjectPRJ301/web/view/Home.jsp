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

        <link href="./css/bootstrap.min.css" rel="stylesheet">

        <link href="./css/bootstrap-icons.css" rel="stylesheet">

        <link href="./css/templatemo-topic-listing.css" rel="stylesheet">      

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

    <jsp:include page="../view/Header.jsp"/>
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
     <jsp:include page="../view/Footer.jsp"/>



<!-- JAVASCRIPT FILES -->
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.bundle.min.js"></script>
<script src="../js/jquery.sticky.js"></script>
<script src="../js/click-scroll.js"></script>
<script src="../js/custom.js"></script>

</body>
</html>
