package com.fran.anotaciones2;

import com.fran.anotaciones2.utilidades.HibernateUtils;

public class App 
{
	
	public static void mostrarLibros() {
		HibernateUtils.openSession();
		HibernateUtils.devolverListaObjetos("Libros").forEach(e->System.out.println(e));
	}
	
    public static void main( String[] args )
    {
    	java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.SEVERE);
    	mostrarLibros();
    	
    	
    }
}
