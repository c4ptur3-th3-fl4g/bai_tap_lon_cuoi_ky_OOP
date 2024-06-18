package qlsv.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    public static Connection getConnection() {
        Connection cons = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver"); // for MariaDB
            //cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_qlsv", "root", "002525");
            cons = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db_qlsv", "root", "Phuongk16cntt2!@"); // for MariaDB
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
    
}