/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BaseModel;
import model.Student;

/**
 *
 * @author XuanDinh
 */
public abstract class DBContext <T extends BaseModel>{
    public Connection connection;
    
    public DBContext(){
         try {
            String username = "sa";
            String password = "01052001";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=projectbl5";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public abstract ArrayList<T> list();

    public abstract T get(T model);

    public abstract void insert(T model);

    public abstract void update(T model);

    public abstract void delete(T model);
    
    public abstract void search(T model);
    
    public abstract ArrayList<Student> search(int id);
    
}
