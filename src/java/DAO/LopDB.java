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
import model.Slot;
import model.Student;
import model.lop;

/**
 *
 * @author XuanDinh
 */
public class LopDB extends DBContext<lop> {

    @Override
    public ArrayList<lop> list() {
        ArrayList<lop> lop = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "FROM lop";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                lop t = new lop();
                t.setIdlop(rs.getInt("idlop"));
                t.setLop(rs.getString("lop"));
                t.setSlotid(rs.getInt("slotid"));
                lop.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lop;
    }

    @Override
    public lop get(lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
