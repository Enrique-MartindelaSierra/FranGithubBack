package com.fran.json;

import java.util.ArrayList;
import java.util.List;

import com.fran.json.entidades.People;
import com.fran.json.entidades.Posts;
import com.fran.json.utilidades.JsonUtils;

public class App 
{
	static List<Posts> publicaciones = new ArrayList<Posts>();
	
    public static void main( String[] args )
    {
        //JsonUtils.leerJsonDesdeFichero("C:/ficheros/profesor.json");
    	// Leer con Json simple desde Internet
    	/*
        publicaciones = JsonUtils.leerPostsInternet("https://jsonplaceholder.typicode.com/posts");
        publicaciones.stream()
        .filter(e->e.getId()%2==0)  // publicaciones pares        
        .forEach(e->System.out.println(e));
        */
    	// Escribir con Json Simple
    	//JsonUtils.escribirJsonSimple();
    	
    	// leer Personaje con gson
    	/*
    	People luke = JsonUtils.leerPersonaje("https://swapi.dev/api/people/1?format=json");
    	System.out.println(luke);
    	*/
    	// devolver lista de personajes
    	List<People> personajes1al10 = JsonUtils.leerPersonajes("https://swapi.dev/api/people/", 1, 10, "?format=json");
    	personajes1al10.forEach(e->System.out.println(e));
    }
}
