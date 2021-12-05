/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.LopDB;
import DAO.NgayDB;
import DAO.SlotDB;
import DAO.StudentDB;
import DAO.TuanDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Ngay;
import model.Slot;
import model.Student;
import model.Tuan;
import model.lop;

/**
 *
 * @author XuanDinh
 */
public class listController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        TuanDB t = new TuanDB();
//        NgayDB n = new NgayDB();
//        SlotDB sl = new SlotDB();
//        LopDB l = new LopDB();
        StudentDB s = new StudentDB();
//        ArrayList<Tuan> tuan = t.list();
//        ArrayList<Ngay> ngay = n.list();
//        ArrayList<Slot> slot = sl.list();
//        ArrayList<lop> lop = l.list();
        ArrayList<Student> student = s.list();
//        request.setAttribute("tuan", tuan);
//        request.setAttribute("ngay", ngay);
//        request.setAttribute("slot", slot);
//        request.setAttribute("lop", lop);
        request.setAttribute("student", student);
        request.getRequestDispatcher("list.jsp").forward(request, response);

    
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
