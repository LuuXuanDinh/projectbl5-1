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
public class Ngay extends BaseModel {

    private int idngay;
    private String ngay;
    private int tuanid;

    public Ngay() {
    }

    public Ngay(int idngay, String ngay) {
        this.idngay = idngay;
        this.ngay = ngay;
    }

    public Ngay(int idngay, String ngay, int tuanid) {
        this.idngay = idngay;
        this.ngay = ngay;
        this.tuanid = tuanid;
    }

    public int getIdngay() {
        return idngay;
    }

    public void setIdngay(int idngay) {
        this.idngay = idngay;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getTuanid() {
        return tuanid;
    }

    public void setTuanid(int tuanid) {
        this.tuanid = tuanid;
    }

}
