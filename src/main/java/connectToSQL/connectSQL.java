
package connectToSQL;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectSQL {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Bao Hanh Xe May;"
            +  "encrypt=true;"
            + "trustServerCertificate=true;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123456";
    Connection conn;
    public connectSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Đã kết nối database");
        }
        // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public ResultSet xemNhanVien(){
        String SQL = "{call xem_nv}";
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    public int timTk(String tk, String mk){
        int result = 0;
        String SQL = "{call tim_tk(?,?)}";
        CallableStatement cs;
        ResultSet rs;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, tk);
            cs.setString(2, mk);
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    public ResultSet timnv_bang_tk(String tk){
        String SQL = "{call timnv_bang_tk(?)}";
        CallableStatement cs;
        ResultSet rs = null;
        try{
            cs = conn.prepareCall(SQL);
            cs.setString(1, tk);
            rs = cs.executeQuery();
            rs.next();
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    public ResultSet ds_pbh_nhan(){
        String SQL = "SELECT * FROM ds_pbh_nhan";
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int them_kh(String maKH, String StrCCCD, String StrHo, String StrTen, Date StrNgaySinh , String StrSDT, String StrGioi, String StrMail){
        String SQL = "{call them_kh(?,?,?,?,?,?,?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, maKH);
            cs.setString(2, StrCCCD);
            cs.setString(3, StrHo);
            cs.setString(4, StrTen);
            cs.setDate(5, new java.sql.Date(StrNgaySinh.getTime()));
            cs.setString(6, StrSDT);
            cs.setString(7, StrGioi);
            cs.setString(8, StrMail);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet bang_mau_model(String model){
        String SQL = "{call bang_mau_model(?)}";
        CallableStatement cs;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, model);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public ResultSet mau_chua_co(String model){
        String SQL = "{call mau_chua_co(?)}";
        CallableStatement st;
        ResultSet rs = null;
        try {
            st = conn.prepareCall(SQL);
            st.setString(1, model);
            rs = st.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int xoa_mau_model(String mau){
        String SQL = "{call xoa_mau_model(?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, Integer.parseInt(mau));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(connectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int them_mau_sac(String ten){
        String SQL = "{call them_mau_sac(?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, ten);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(connectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int doi_tt_mau(String mau, String tt){
        String SQL = "{call doi_tt_mau(?,?)}";
        CallableStatement cs;
        int result =  0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, Integer.parseInt(mau));
            cs.setInt(2, Integer.parseInt(tt));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int co_the_xoa_mau_model(String ma){
        String SQL = "{call co_the_xoa_mau_model(?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, Integer.parseInt(ma));
            ResultSet rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(connectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int them_mau_model(String ma, String mau){
        String SQL = "{call them_mau_model(?,?)}";
        CallableStatement cs;
        int result =  0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, ma);
            cs.setInt(2, Integer.parseInt(mau));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet ds_mau(String model){
        String SQL = "{call ds_mau(?)}";
        ResultSet rs = null;
        CallableStatement cs;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, model);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int sua_tt_xe(String kx, Date namsx, String mamau){
        String SQL = "{call sua_tt_xe(?,?,?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, kx);
            cs.setDate(2, new java.sql.Date(namsx.getTime()));
            cs.setInt(3, Integer.parseInt(mamau));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet qua_trinh_bh(String id_nhan){
        String SQL = "{call sp_qua_trinh_bh(?)}";
        CallableStatement cs;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, id_nhan);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    
    public ResultSet ds_kh(){
        String SQL = "SELECT * FROM KhachHang";
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int xoa_mdel(String model){
        String SQL = "{call xoa_model(?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, model);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int co_the_xoa_model(String model){
        String SQL = "{call co_the_xoa_model(?)}";
        CallableStatement cs;
        ResultSet rs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1,model);
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int sua_model(String model, String loai, String khoiLuong, String dai, String rong, String cao, String xang, String dongCo, String ten){
        String SQL = "{call sua_model(?,?,?,?,?,?,?,?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, model);
            cs.setString(2, loai);
            cs.setString(3, khoiLuong);
            cs.setString(4, dai);
            cs.setString(5, rong);
            cs.setString(6, cao);
            cs.setString(7, xang);
            if(dongCo.equalsIgnoreCase("null") || dongCo.isEmpty()){
                cs.setNull(8, java.sql.Types.VARCHAR);
            }else{
                cs.setString(8, dongCo);
            }
            cs.setString(9, ten);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet sp_ct_kh(String makh){
        String SQL = "{call sp_ct_kh(?)}";
        CallableStatement cs;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, makh);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int them_model(String model, String loai, String khoiLuong, String dai, String rong, String cao, String xang, String dongCo, String ten){
        String SQL = "{call them_model(?,?,?,?,?,?,?,?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, model);
            cs.setString(2, loai);
            cs.setString(3, khoiLuong);
            cs.setString(4, dai);
            cs.setString(5, rong);
            cs.setString(6, cao);
            cs.setString(7,xang);
            if(dongCo.equalsIgnoreCase("null") || dongCo.isEmpty()){
                cs.setNull(8, java.sql.Types.VARCHAR);
            }else{
                cs.setString(8, dongCo);
            }
            cs.setString(9, ten);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(connectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ResultSet ds_model(){
        String SQL = "SELECT * FROM Model";
        ResultSet rs = null;
        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int them_xe_tbh(String kx, String model, Date nam, String mau, String tbh, Date han){
        String SQL = "{call them_xe_tbh(?,?,?,?,?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1,kx);
            cs.setString(2,model);
            cs.setDate(3, new java.sql.Date(nam.getTime()));
            cs.setInt(4, Integer.parseInt(mau));
            cs.setString(5, tbh);
            cs.setDate(6, new java.sql.Date(han.getTime()));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet xem_model(String ma){
        String SQL = "{call xem_model(?)}";
        ResultSet rs = null;
        CallableStatement cs;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, ma);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(connectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet kiem_tra_bh(String kx){
        String SQL = "{call kiem_tra_bh(?)}";
        CallableStatement cs;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, kx);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int changePass(String pass, String tk){
        String SQL = "{call updatesPass(?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, pass);
            cs.setString(2, tk);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet updatePass(String pass){
        String SQL = "{call updatesPass(?,?)}";
        CallableStatement cs;
        ResultSet rs = null;
        String tk = new com.raven.main.WelcomeJFrame().getTK();
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, pass);
            cs.setString(2, tk);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int co_the_xoa_sua_pbh_nhan(String id_nhan){
        String SQL = "{call co_the_xoa_sua_pbh_nhan(?)}";
        CallableStatement cs;
        ResultSet rs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, Integer.parseInt(id_nhan));
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet quyen_tk(String tk){
        String SQL = "{call lay_quyen(?)}";
        ResultSet rs = null;
        CallableStatement cs;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, tk);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public ResultSet ds_nv(){
        String SQL = "SELECT * FROM NhanVien";
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public ResultSet xem_tk(String tk){
        String SQL = "{call xem_tk(?)}";
        CallableStatement cs;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, tk);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;

    }
    
    public int them_nv(String manv, String ho, String ten, Date ngaySinh, String sdt, String email, Date tgvao, String gioi){
        String SQL = "{call them_nv(?,?,?,?,?,?,?,?,?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, manv);
            cs.setString(2, ho);
            cs.setString(3, ten);
            cs.setDate(4, new java.sql.Date(ngaySinh.getTime()));
            if(sdt.equalsIgnoreCase("null") || sdt.isBlank()){
                cs.setNull(5, java.sql.Types.VARCHAR);
            }else{
                cs.setString(5, sdt);
            }
            if (email.equalsIgnoreCase("null") || email.isBlank()) {
                cs.setNull(6, java.sql.Types.VARCHAR);
            } else {
                cs.setString(6, email);
            }
            cs.setDate(7, new java.sql.Date(tgvao.getTime()));
            cs.setNull(8, java.sql.Types.DATE);
            cs.setString(9, gioi);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int them_tk(String manv){
        String SQl = "{call them_tk(?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQl);
            cs.setString(1, manv);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int sua_TT(int tt, String tk){
        String SQL = "{call suaTT(?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, tt);
            cs.setString(2, tk);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int doi_quyen(String tentk, int id_quyen){
        String SQL = "{call doi_quyen(?,?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, tentk);
            cs.setInt(2, id_quyen);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int them_pbh(String maTBH, String maNV, Date tg, String makh, String tinhTrang){
        String SQL = "{call them_pbh(?,?,?,?,?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1,maTBH);
            cs.setString(2,maNV);
            cs.setDate(3, new java.sql.Date(tg.getTime()));
            cs.setString(4, makh);
            cs.setString(5,tinhTrang);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
        
    }
    
    public int xoa_pbh_nhan(String id_nhan){
        String SQL = "{call xoa_pbh_nhan(?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1,Integer.parseInt(id_nhan));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int nv_updates_pbh_nhan(String matbh, String id_nhan){
        String SQL = "{call nv_updates_pbh_nhan(?,?)}";
        CallableStatement cs;
        ResultSet rs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, matbh);
            cs.setInt(2, Integer.parseInt(id_nhan));
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet timKH(String makh){
        String SQL = "{call tim_kh(?)}";
        ResultSet rs = null;
        CallableStatement cs;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, makh);
            rs = cs.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
        
    }
    
    public int nghi_viec(String manv){
        String SQL = "{call nghi_viec(?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, manv);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet ds_xe(){
        String SQL = "SELECT * FROM Xe";
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int sua_nv(String manv, String ho, String ten, String sdt, String email, String gioi, Date ngaySinh){
        String SQL = "{call sua_nv(?,?,?,?,?,?,?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, manv);
            if(ho.equalsIgnoreCase("")){
                cs.setNull(2,java.sql.Types.VARCHAR);
            }else{
                cs.setString(2,ho);
            }
            if(ten.equalsIgnoreCase("")){
                cs.setNull(3,java.sql.Types.VARCHAR);
            }else{
                cs.setString(3,ten);
            }
            if(sdt.equalsIgnoreCase("")){
                cs.setNull(4, java.sql.Types.VARCHAR);
            }else{
                cs.setString(4, sdt);
            }
            if(email.equalsIgnoreCase("")){
                cs.setNull(5, java.sql.Types.VARCHAR);
            }else{
                cs.setString(5, email);
            }
            cs.setString(6, gioi);
            cs.setDate(7, new java.sql.Date(ngaySinh.getTime()));
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int sua_kh(String makh, String cccd, String ho, String ten, String gioi, String mail, Date ngaySinh, String SDT){
        String SQL = "{call sua_kh(?,?,?,?,?,?,?,?)}";
        CallableStatement cs;
        ResultSet rs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, makh);
            cs.setString(2, cccd);
            cs.setString(3, ho);
            cs.setString(4, ten);
            cs.setDate(5, new java.sql.Date(ngaySinh.getTime()));
            if (SDT == null){
                cs.setNull(6, java.sql.Types.VARCHAR);
            }
            else{
                cs.setString(6, SDT);
            }
            cs.setString(7, gioi);
            if (mail == null){
                cs.setNull(8, java.sql.Types.VARCHAR);
            }
            else{
                cs.setString(8, mail);
            }
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int them_phieu_tra(int phieuNhan, Date ngayTra, String moTa, String nVTra){
        String SQL = "{call them_phieu_tra(?,?,?,?)}";
        CallableStatement cs;
        int result = 0;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, phieuNhan);
            cs.setDate(2, new java.sql.Date(ngayTra.getTime()));
            if(moTa == null){
                cs.setNull(3, java.sql.Types.VARCHAR);
            }
            else{
                cs.setString(3, moTa);
            }
            cs.setString(4, nVTra);
            result =  cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet ds_tbh(){
        String SQL = "{call ds_tbh()}";
        Statement st;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    public int them_qua_trinh(String id_nhan, Date tg, String mota, String manv, String gia){
        String SQL = "{call them_qua_trinh(?,?,?,?,?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setInt(1, Integer.parseInt(id_nhan));
            cs.setDate(2, new java.sql.Date(tg.getTime()));
            cs.setString(3, mota);
            cs.setString(4, manv);
            if(gia.equalsIgnoreCase("null") || gia.isEmpty()){
                cs.setNull(5, java.sql.Types.DECIMAL);
            }else{
                cs.setBigDecimal(5,  new BigDecimal(gia));
            }
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public int co_the_xoa_kh(String makh){
        String SQL = "{call co_the_xoa_kh(?)}";
        CallableStatement cs;
        ResultSet rs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, makh);
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(connectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int xoa_kh(String makh){
        String SQL = "{call xoa_kh(?)}";
        CallableStatement cs;
        int result = -1;
        try {
            cs = conn.prepareCall(SQL);
            cs.setString(1, makh);
            result = cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
