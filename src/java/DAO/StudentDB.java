/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import model.lop;

/**
 *
 * @author XuanDinh
 */
public class StudentDB extends DBContext<Student>{

    @Override
    public ArrayList<Student> list() {
         ArrayList<Student> Student = new ArrayList<>();
        try {
            String sql = "SELECT idhocsinh,name,mssv,diemdanh\n"
                    + "FROM hocsinh";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setIdhocsinh(rs.getInt("idhocsinh"));
//                s.setLopid(rs.getInt("lopid"));
                s.setName(rs.getString("name"));
//                s.setSlotid(rs.getInt("slotid"));
//                s.setTuanid(rs.getInt("tuanid"));
//                s.setNgayid(rs.getInt("ngayid"));
                s.setMssv(rs.getString("mssv"));
                s.setDiemdanh(rs.getBoolean("diemdanh"));
                Student.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Student;
    }

    @Override
    public Student get(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
