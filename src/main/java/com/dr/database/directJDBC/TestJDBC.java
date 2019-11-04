package com.dr.database.directJDBC;

import java.sql.*;

public class TestJDBC {
    private String url = "jdbc:postgresql://localhost:5432/testdb";
    private String username = "testuser";
    private String password = "test123!";
    private String postgresqlDrive ="org.postgresql.Driver";
    private Connection connection = null;
    public Connection getConn() {
        try {
            Class.forName(postgresqlDrive).newInstance();
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }
        return connection;
    }

    public ResultSet query(Connection conn, String sql) {
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        try {
            pStatement = conn.prepareStatement(sql);
            rs = pStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void main(String[] args) throws SQLException {
        TestJDBC testJDBC = new TestJDBC();
        Connection myconn = testJDBC.getConn();
        ResultSet rs = testJDBC.query(myconn, "select * from bp b where b.tenant_id = 'ray'");
        while(rs.next()){
            int id = rs.getInt("id");
            System.out.println("id:"+id);
            myconn.close();
        }
    }

}
