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
import model.Ngay;
import model.Student;
import model.Tuan;

/**
 *
 * @author XuanDinh
 */
public class NgayDB extends DBContext<Ngay> {

    @Override
    public ArrayList<Ngay> list() {
        ArrayList<Ngay> ngay = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "FROM ngay";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ngay t = new Ngay();
                t.setIdngay(rs.getInt("idngay"));
                t.setNgay(rs.getString("ngay"));
                t.setTuanid(rs.getInt("tuanid"));
                ngay.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NgayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ngay;
    }

    @Override
    public Ngay get(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
