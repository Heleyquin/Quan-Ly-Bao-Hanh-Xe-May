
package connectToSQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String SQL = "select * From xem_ds_nhan_bh";
        Statement st = null;
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
    
    public void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
