
package connectToSQL;

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
        CallableStatement cs = null;
        ResultSet rs = null;
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
        CallableStatement cs = null;
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
        String SQL = "SELECT * FROM xem_ds_pbh_nhan";
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
    
    public ResultSet qua_trinh_bh(String id_nhan){
        String SQL = "{call sp_qua_trinh_bh(?)}";
        CallableStatement cs = null;
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
    
    public ResultSet sp_ct_kh(String makh){
        String SQL = "{call sp_ct_kh(?)}";
        CallableStatement cs = null;
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
            cs.setString(6, SDT);
            cs.setString(7, gioi);
            cs.setString(8, mail);
            rs = cs.executeQuery();
            rs.next();
            result = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return result;
    }
    
    public ResultSet ds_tbh(){
        String SQL = "SELECT MaTBH FROM TheBH";
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
