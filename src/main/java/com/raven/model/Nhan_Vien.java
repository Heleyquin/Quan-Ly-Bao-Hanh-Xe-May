package com.raven.model;

import javax.swing.Icon;

public class Nhan_Vien {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String description) {
        this.quyen = quyen;
    }

    public String getNgaySinh(){
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    public String getSDT(){
        return sdt;
    }
    public void setSDT(String sdt){
        this.sdt=sdt;
    }
    public String getGioi(){
        return gioi;
    }
    public void setGioi(String gioi){
        this.gioi = gioi;
    }
    public String getNgayVao(){
        return ngayVao;
    }
    public void setNgayVao(String ngayVao){
        this.ngayVao = ngayVao;
    }
    public Nhan_Vien(Icon icon, String ten, String email, String ngaySinh, String sdt, String gioi, String ngayVao, String quyen) {
        this.icon = icon;
        this.ten = ten;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.gioi = gioi;
        this.ngayVao = ngayVao;
        this.quyen = quyen;
    }

    public Nhan_Vien() {
    }

    private Icon icon;
    private String ten;
    private String email;
    private String ngaySinh;
    private String sdt;
    private String gioi;
    private String ngayVao;
    private String quyen;
}
