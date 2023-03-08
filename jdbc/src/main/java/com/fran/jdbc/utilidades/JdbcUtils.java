package com.fran.jdbc.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	
	final static String URI = "jdbc:mysql://localhost:3306/jdbc";
	final static String USER = "root";
	final static String PASSWORD = "";
	
	public static Connection con;
	public static Statement st;
	
	public static void conexion() {
		con = null;
		try {
			con = DriverManager.getConnection(URI, USER, PASSWORD);
			System.out.println("La conexión se realizó correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo en la conexión");
		}
	}
	
	public static void desconexion() {
		try {
			if(!con.isClosed()) {
				con.close();
				System.out.println("La desconexión se realizó correctamente");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
