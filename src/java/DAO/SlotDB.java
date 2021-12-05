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
import model.Slot;
import model.Student;

/**
 *
 * @author XuanDinh
 */
public class SlotDB extends DBContext<Slot> {

    @Override
    public ArrayList<Slot> list() {
        ArrayList<Slot> Slot = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "FROM slot";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Slot sl = new Slot();
                sl.setIdslot(rs.getInt("idslot"));
                sl.setSlot(rs.getString("slot"));
                sl.setNgayid(rs.getInt("ngayid"));
                Slot.add(sl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SlotDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Slot;
    }

    @Override
    public Slot get(Slot model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Slot model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Slot model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Slot model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(Slot model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
