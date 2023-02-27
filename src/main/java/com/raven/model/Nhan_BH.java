
package com.raven.model;

public class Nhan_BH {
    private String maTBH;
    private String maNVNhan;
    private String maNVTra;
    private String ngayTiepNhan;
    private String maNhanBH;
    private String ngayTra;
    public Nhan_BH(){
    }
    
    public Nhan_BH(String maTBH, String maNVNhan, String maNVTra, String ngayTiepNhan, String maNhanBH, String ngayTra){
        this.maNVNhan = maNVNhan;
        this.maNVTra = maNVTra;
        this.maTBH = maTBH;
        this.ngayTiepNhan = ngayTiepNhan;
        this.maNhanBH = maNhanBH;
        this.ngayTra = ngayTra;
    }
    
    public String getMaTBH(){
        return maTBH;
    }
    public void setMaTBH(String maTBH) {
        this.maTBH = maTBH;
    }

    public void setMaNVNhan(String maNVNhan) {
        this.maNVNhan = maNVNhan;
    }
    public String getMaNVNhan() {
        return maNVNhan;
    }

    public void setMaNVTra(String maNVTra){
        this.maNVTra = maNVTra;
    }
    public String getMaNVTra(){
        return maNVTra;
    }
    
    public void setNgayTiepNhan(String ngayTiepNhan){
        this.ngayTiepNhan = ngayTiepNhan;
    }
    public String getNgayTiepNhan(){
        return ngayTiepNhan;
    }
    
    public void setMaNhanBH(String maNhanBH){
        this.maNhanBH = maNhanBH;
    }
    public String getMaNhanBH(){
        return maNhanBH;
    }
    
    public void setNgayTra(String ngayTra){
        this.ngayTra = ngayTra;
    }
    public String getNgayTra(){
        return ngayTra;
    }
}

