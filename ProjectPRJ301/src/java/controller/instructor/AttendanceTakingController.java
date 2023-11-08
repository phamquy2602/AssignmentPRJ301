/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.instructor;

import dal.AttendanceDBContext;
import dal.SessionDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Attendance;
import model.assingment.Session;
import model.assingment.Student;

/**
 *
 * @author quyde
 */
public class AttendanceTakingController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AttendanceTakingController</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AttendanceTakingController at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        SessionDBContext db = new SessionDBContext();
        int id = Integer.parseInt(request.getParameter("id"));
        Session ses = db.getSessions(id);
        request.setAttribute("ses",ses);
        
        AttendanceDBContext attDb = new AttendanceDBContext();
        ArrayList<Attendance> atts = attDb.getAttendancesBySession(id);
        
        request.setAttribute("atts", atts);
        request.getRequestDispatcher("./view/instructor/att.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Session ses = new Session();
        ses.setId(Integer.parseInt(request.getParameter("sesid")));
        String[] stuids = request.getParameterValues("stuid");
        for (String stuid : stuids) {
            Attendance a = new Attendance();
            a.setSession(ses);
            Student s = new Student();
            s.setId(Integer.parseInt(stuid));
            a.setStudent(s);
            a.setStatus(request.getParameter("status"+stuid).equals("present"));
            a.setDescription(request.getParameter("description"+stuid));
            ses.getAtts().add(a);
        }
        SessionDBContext sesDB = new SessionDBContext();
        sesDB.addAttendences(ses);
        
        request.getRequestDispatcher("view/Message.jsp").forward(request, response);
        
        

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
