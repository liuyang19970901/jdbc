package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {


        static {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
            }catch (ClassNotFoundException e){
                e.printStackTrace();

            }


        }

        public static void main(String[] args) throws SQLException {
            Connection connection=null;
            try {
                connection = DriverManager.getConnection( "jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb" );
            }catch (SQLException throwables){
                throwables.printStackTrace();

            }finally {
                if (connection==null){
                    connection.close();
                }
            }

        }


        // write your code here

    }


