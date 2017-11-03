/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tfurst
 */
public class Database {
    public static Connection getConnection(String url) throws SQLException
    {
        Connection con = DriverManager.getConnection(url);
            
        return con;
    }
    
    public static void close(Connection con)
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            //System.out.println();
        }
    }
}
