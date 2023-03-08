package com.fran.jdbc;

import com.fran.jdbc.utilidades.JdbcUtils;

public class App 
{
    public static void main( String[] args )
    {
        JdbcUtils.conexion();
        // Aquí irá el programa
        JdbcUtils.desconexion();
    }
}
