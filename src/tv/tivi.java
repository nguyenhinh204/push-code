/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tv;

import java.io.Serializable;

/**
 *
 * @author nguyenhinh
 */
public class tivi implements Serializable{

    private String ten;
    private String hang;
    private Integer gia;
    private String hotroi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getHotroi() {
        return hotroi;
    }

    public void setHotroi(String hotroi) {
        this.hotroi = hotroi;
    }

    public tivi(String ten, String hang, Integer gia, String hotroi) {
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.hotroi = hotroi;
    }

    public tivi() {
    }

}
