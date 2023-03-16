package com.fran.anotaciones2.utilidades;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	static SessionFactory sessionFactory;
	static Session session;
	
	/**
	 * Abre una conexión con la base de datos
	 * @return True si la conexión se abre correctamente. False en caso contrario
	 */
	public static boolean openSession() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        return (session!=null);
	}
	
	/**
	 * Cierra la conexión con la base de datos
	 * @return True si la conexión se cierra correctamente. False en caso contrario
	 */
	public static boolean closeSession() {		
		try {
			if(session!=null)
				session.close();
			if(sessionFactory!=null)
				sessionFactory.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * Dado el nombre de una clase, devuelve una lista con todos los elementos que tiene.
	 * Usaremos este método en un proyecto < Hibernate 6.0
	 * <br>ex: HibernateUtils.devolverListaObjetos("Libros")
	 * @param clase Nombre de la clase de la que queremos obtener todos los datos.
	 * @return Lista con el equivalente a todas las filas de la tabla de ese nombre
	 */
	@SuppressWarnings("deprecation")
	public static List<?> devolverListaObjetos(String clase){
		return session.createQuery("from " + clase).list();
	}
	
	/**
	 * Dado el tipo de una clase, devuelve una lista con todos los elementos que tiene.
	 * Usaremos este método en un proyecto >= Hibernate 6.0
	 * @param <T> Tipo de la clase
	 * @param clase Clase pasada
	 * @return Lista con el equivalente a todas las filas de la tabla de ese nombre
	 */
	public static <T> List<T> devolverListaObjetos(Class<T> clase){
		return session.createSelectionQuery("from " + clase.getSimpleName(),clase).list();
	}
	

}
