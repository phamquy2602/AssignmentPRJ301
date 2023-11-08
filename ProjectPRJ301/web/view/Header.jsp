<%-- 
    Document   : Header
    Created on : Oct 25, 2023, 2:44:51 AM
    Author     : quyde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                                    
                                </ul>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">Information Access</a>
                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="timetable?id=${userId}">Weekly timetable</a></li>
                                    <li><a class="dropdown-item" href="#">Attendance Status</a></li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">reports</a>
                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    
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
                                    <li><a class="dropdown-item" href="logout">Logout</a></li>
                                </ul>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
