package com.fran.anotaciones2.utilidades;

import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fran.anotaciones2.entidades.Autores;
import com.fran.anotaciones2.entidades.Libros;

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
	 * <br> ex: HibernateUtils.devolverListaObjetos(Autores.class)
	 * @param <T> Tipo de la clase
	 * @param clase Clase pasada
	 * @return Lista con el equivalente a todas las filas de la tabla de ese nombre
	 */
	public static <T> List<T> devolverListaObjetos(Class<T> clase){
		return session.createSelectionQuery("from " + clase.getSimpleName(),clase).list();
	}
	
	/**
	 * Inserta el registro en su tabla correspondiente de la base de datos
	 * <br> ex: HibernateUtils.save(new Autores("AAAAA","Nombre de prueba",new HashSet<Libros>(0)));
	 * @param object Objeto de la clase que queremos insertar
	 * @return True si la inserción es correcta. False si falla.
	 */
	public static boolean save(Object object) {
		try {
			Transaction trans = session.beginTransaction();  // abro la transacción		
			session.persist(object);  // antiguo save. Persist es a partir de la versión 6.0
			trans.commit();  // confirmo los cambios en la transacción
			session.clear();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
