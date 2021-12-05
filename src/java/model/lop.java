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
public class lop extends BaseModel {

    private int idlop;
    private String lop;
    private int slotid;

    public lop() {
    }

    public lop(int idlop, String lop) {
        this.idlop = idlop;
        this.lop = lop;
    }

    public lop(int idlop, String lop, int slotid) {
        this.idlop = idlop;
        this.lop = lop;
        this.slotid = slotid;
    }

    public int getIdlop() {
        return idlop;
    }

    public void setIdlop(int idlop) {
        this.idlop = idlop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getSlotid() {
        return slotid;
    }

    public void setSlotid(int slotid) {
        this.slotid = slotid;
    }

}
