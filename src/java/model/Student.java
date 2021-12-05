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
public class Student extends BaseModel {

    private int idhocsinh;
    private int lopid;
    private String name;
    private int slotid;
    private int tuanid;
    private int ngayid;
    private String mssv;
    private boolean diemdanh;

    public Student() {
    }

    public Student(int idhocsinh, int lopid, String name, int slotid, int tuanid, int ngayid, String mssv, boolean diemdanh) {
        this.idhocsinh = idhocsinh;
        this.lopid = lopid;
        this.name = name;
        this.slotid = slotid;
        this.tuanid = tuanid;
        this.ngayid = ngayid;
        this.mssv = mssv;
        this.diemdanh = diemdanh;
    }

    public int getIdhocsinh() {
        return idhocsinh;
    }

    public void setIdhocsinh(int idhocsinh) {
        this.idhocsinh = idhocsinh;
    }

    public int getLopid() {
        return lopid;
    }

    public void setLopid(int lopid) {
        this.lopid = lopid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlotid() {
        return slotid;
    }

    public void setSlotid(int slotid) {
        this.slotid = slotid;
    }

    public int getTuanid() {
        return tuanid;
    }

    public void setTuanid(int tuanid) {
        this.tuanid = tuanid;
    }

    public int getNgayid() {
        return ngayid;
    }

    public void setNgayid(int ngayid) {
        this.ngayid = ngayid;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public boolean isDiemdanh() {
        return diemdanh;
    }

    public void setDiemdanh(boolean diemdanh) {
        this.diemdanh = diemdanh;
    }
    
    

}
