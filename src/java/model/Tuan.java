/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author XuanDinh
 */
public class Tuan extends BaseModel{
    private int idtuan;
    private  String tuan;

    public Tuan() {
    }

    public Tuan(int idtuan, String tuan) {
        this.idtuan = idtuan;
        this.tuan = tuan;
    }

    public int getIdtuan() {
        return idtuan;
    }

    public void setIdtuan(int idtuan) {
        this.idtuan = idtuan;
    }

    public String getTuan() {
        return tuan;
    }

    public void setTuan(String tuan) {
        this.tuan = tuan;
    }
    
}
