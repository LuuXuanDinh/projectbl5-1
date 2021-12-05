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
public class Slot extends BaseModel {

    private int idslot;
    private String slot;
    private int ngayid;

    public Slot() {
    }

    public Slot(int idslot, String slot) {
        this.idslot = idslot;
        this.slot = slot;
    }

    public Slot(int idslot, String slot, int ngayid) {
        this.idslot = idslot;
        this.slot = slot;
        this.ngayid = ngayid;
    }

    public int getIdslot() {
        return idslot;
    }

    public void setIdslot(int idslot) {
        this.idslot = idslot;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getNgayid() {
        return ngayid;
    }

    public void setNgayid(int ngayid) {
        this.ngayid = ngayid;
    }

}
