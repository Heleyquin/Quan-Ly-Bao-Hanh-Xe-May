
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
        // Create a variable for the connection string.
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
            return result;
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
}
