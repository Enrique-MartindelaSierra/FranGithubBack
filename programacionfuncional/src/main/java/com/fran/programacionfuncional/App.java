package com.fran.programacionfuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fran.programacionfuncional.entidades.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
	static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static void poblar() { // tearUp
		usuarios.clear();
		usuarios.add(new Usuario(1,"Fran",30000));
		usuarios.add(new Usuario(2,"Ángel",20000));
		usuarios.add(new Usuario(3,"Miguel Ángel",40000));
		usuarios.add(new Usuario(4,"David",30000));
		usuarios.add(new Usuario(5,"Enrique",50000));
		usuarios.add(new Usuario(6,"Naomi",-30000));
		usuarios.add(new Usuario(1,"Fran",30000));
		usuarios.add(new Usuario(7,"Francisco",100000));
	}
	
	public static void descargar() {  //tearDown
		usuarios.clear();
	}
	
	/**
	 * Recorrer los elementos de una lista
	 */
	public static void forEach() {
		// Final
		
		// if de toda la vida
		for(int i = 0; i<usuarios.size(); i ++) {
			System.out.println(i + ". " + usuarios.get(i).toString());
		}
		
		// bucle for-each
		for(Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		
		// Programación funcional
		usuarios.forEach(e->System.out.println(e));
		
		usuarios.forEach(System.out::println);
		
		usuarios.stream().forEach(e->System.out.println(e));
		
	}
	
	/**
	 * permite filtrar los elementos de una lista
	 */
	public static void filter() {
		// No final
		usuarios.stream()
			.filter(e->e.getSueldo()>30000)
			.forEach(e->System.out.println(e));
		
		usuarios.stream()
		.filter(e->e.getSueldo()>30000 && e.getSueldo()<50000)
		.forEach(e->System.out.println(e));
		
		usuarios.stream()
		.filter(e->e.getSueldo()>30000)
		.filter(e->e.getSueldo()<50000)
		.forEach(e->System.out.println(e));
		
		// Creación de una sublista
		List<Usuario> ricos = usuarios.stream()
				.filter(e->e.getSueldo()>=50000)
				.collect(Collectors.toList());  // crea la sublista
		System.out.println("Los ricos son:");
		ricos.forEach(e->System.out.println(e));
		
	}
	
    public static void main( String[] args )
    {
    	poblar();  // dar datos iniciales
    	//forEach();
    	filter();
    }
}
