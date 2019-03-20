/**
 * 
 */
package com.cricinfo.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cricinfo.constants.MySqlConstants;


/**
 * @author athar
 *
 */
public class JDBCUtils {

	public static Connection getConnection(){
		 Connection conn = null;
		 
		 try {
			Class.forName(MySqlConstants.JDBC_DRIVER);			
			conn = DriverManager.getConnection(MySqlConstants.DB_URL, MySqlConstants.USER, MySqlConstants.PASS);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return conn;
	}
}
