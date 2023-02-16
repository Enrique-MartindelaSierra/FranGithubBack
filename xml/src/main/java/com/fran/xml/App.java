package com.fran.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fran.xml.entidades.Asignatura;


public class App 
{
	
	public static void leerXmlFichero(String nombreFichero) {
		try {
			File inputFile = new File(nombreFichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			System.out.println("Elemento base : " + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("asignatura");
			System.out.println();
			System.out.println("Recorriendo asignaturas...");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Codigo: " + eElement.getAttribute("id"));
					System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println(
							"Ciclo: " + eElement.getElementsByTagName("cicloFormativo").item(0).getTextContent());
					System.out.println("Curso: " + eElement.getElementsByTagName("curso").item(0).getTextContent());
					System.out
							.println("Profesor: " + eElement.getElementsByTagName("profesor").item(0).getTextContent());
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static List<Asignatura> devolverAsignaturas(String nombreFichero) {
		List<Asignatura> resultado = new ArrayList<>();
		try {
			File inputFile = new File(nombreFichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("asignatura");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new Asignatura(
							eElement.getAttribute("id"),
							eElement.getElementsByTagName("nombre").item(0).getTextContent(),
							eElement.getElementsByTagName("cicloFormativo").item(0).getTextContent(),
							eElement.getElementsByTagName("curso").item(0).getTextContent(),
							eElement.getElementsByTagName("profesor").item(0).getTextContent()					
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	

	
	
    public static void main( String[] args )
    {
        //leerXmlFichero("asignaturas.xml");
    	List<Asignatura> asignaturas = devolverAsignaturas("asignaturas.xml");
    	asignaturas.stream()
    		.filter(e->e.getCurso().equals("Segundo"))
    		.forEach(e->System.out.println(e));
    		    	
    }
}
