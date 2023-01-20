package ejerciciosEstructuras;

import java.util.Scanner;

public class Ejercicios {
	
	public static void ejercicio1() {
		int numero = 123456;
		if(numero%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
	
	public static void ejercicio8() {
		int numero = 123456;
		System.out.println((numero%2==0)?"El número es par":"El número es impar");
	}
	
	/**
	 * Programa que lea un número entero y muestre si el número es múltiplo de 10 
	 * (si el resto de la división entre 10 da 0).
	 * @param args
	 */
	public static void ejercicio2() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int numero = sc.nextInt();
		if(numero%10==0) {
			System.out.println("El número es múltiplo de 10");
		} else {
			System.out.println("El número no es múltiplo de 10");
		}
		sc.close();
	}
	
	/**
	 * Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. 
	 * Una letra mayúscula es aquella que está entre la ‘A’ y la ‘Z’. Recuerda que se pueden comparar los caracteres como si
	 * fueran números. Utiliza cadena.charAt(0) para acceder al primer carácter recibido.
	 * @param args
	 */
	public static void ejercicio3() {
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		String cadena = sc.nextLine();  // guarda en cadena lo que el usuario escriba en la pantalla
		if(cadena.charAt(0)>='A' && cadena.charAt(0)<='Z') {  // cadena.charAt(0) es la primera letra
			System.out.println("La primera letra es una mayúscula");
		} else {
			System.out.println("La primera letra NO es una mayúscula");
		}		
		sc.close();
	}

	public static void main(String[] args) {
		
		//ejercicio1();
		//ejercicio1b();
		//ejercicio2();
		ejercicio3();
	}

}
