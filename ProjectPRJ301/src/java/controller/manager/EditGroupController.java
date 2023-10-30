/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.manager;

import dal.GroupDBContext;
import dal.InstructorDBContext;
import dal.SubjectDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.assingment.Group;
import model.assingment.Instructor;
import model.assingment.Subject;

/**
 *
 * @author quyde
 */
public class EditGroupController extends HttpServlet {
   
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
            out.println("<title>Servlet EditGroupController</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditGroupController at " + request.getContextPath () + "</h1>");
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
        String gid = request.getParameter("gid");
        
        GroupDBContext dao = new GroupDBContext();
        Group g = dao.get(gid);
        
        InstructorDBContext daoi = new InstructorDBContext();
        ArrayList<Instructor> listI = daoi.listInstructor();
        request.setAttribute("listI",listI);
        
        SubjectDBContext daos = new SubjectDBContext();
        ArrayList<Subject> listS = daos.listSubject();
        request.setAttribute("listS", listS);
        
        request.setAttribute("detail", g);
        request.getRequestDispatcher("./manager/EditGroup.jsp").forward(request, response);
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
        GroupDBContext dao = new GroupDBContext();
        String gid = request.getParameter("gid");
        String name = request.getParameter("name");
        String suid = request.getParameter("subject");
        String insid = request.getParameter("instructor");
        dao.EditGroup(name, suid, insid, gid);
        response.sendRedirect("listgroup");
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
