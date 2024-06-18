package qlsv.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    public static Connection getConnection() {
        Connection cons = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver"); //cho MariaDB
            //Class.forName("com.mysql.cj.jdbc.Driver"); //cho MySQL
            cons = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db_qlsv", "root", "Phuongk16cntt2!@"); //cho MariaDB
            //cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_qlsv", "root", "Phuongk16cntt2!@"); //cho MySQL
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
    
}