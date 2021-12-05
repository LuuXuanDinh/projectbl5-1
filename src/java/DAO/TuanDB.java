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
import model.Tuan;

/**
 *
 * @author XuanDinh
 */
public class TuanDB extends DBContext<Tuan>{

    @Override
    public ArrayList<Tuan> list() {
        ArrayList<Tuan> tuan = new ArrayList<>();
         try {
            String sql = "SELECT *\n"
                    + "FROM tuan";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tuan t = new Tuan();
                t.setIdtuan(rs.getInt("idtuan"));
                t.setTuan(rs.getString("tuan"));
                tuan.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TuanDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tuan;
    }

    @Override
    public Tuan get(Tuan model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Tuan model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Tuan model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Tuan model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(Tuan model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
