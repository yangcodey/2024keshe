package com.keshe.Dbutils;

import java.sql.*;

public class Dbutill {
    static String url = "jdbc:mysql://localhost:3306/jsp_examonline";
    static String user = "root";
    static String password = "123456";

    static {

        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
        }

    }

    public static Connection getConnection(){
        Connection conn =null;
        try {
            conn = DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return conn;
    }
    public static void closeJDBC(Connection cont, Statement stmt, ResultSet res){
        if(cont !=null) {
            try {
                cont.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if(stmt !=null) {
            try {
                stmt.close();
            } catch (Exception e) {
            throw new RuntimeException(e);
            }
        }
        if(res !=null) {
            try {
                res.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
