package ejerciciosEstructuras;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
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
	public static void ejercicio3b() {
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		String cadena = sc.nextLine();  // guarda en cadena lo que el usuario escriba en la pantalla
		char letra = cadena.charAt(0);  // coger la primera letra de una cadena y asignarsela a un char
		if(letra>='A' && letra<='Z') {  // cadena.charAt(0) es la primera letra
			System.out.println("La primera letra es una mayúscula");
		} else {
			System.out.println("La primera letra NO es una mayúscula");
		}		
		sc.close();
	}
	public static void ejercicio3c() {
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0);  // guarda en cadena lo que el usuario escriba en la pantalla
		if(letra>='A' && letra<='Z') {  // cadena.charAt(0) es la primera letra
			System.out.println("La primera letra es una mayúscula");
		} else {
			System.out.println("La primera letra NO es una mayúscula");
		}		
		sc.close();
	}
	
	/**
	 * Programa que le pida 2 cadenas de texto al usuario y compruebe si son iguales.
	 * @param args
	 */
	public static void ejercicio4() {
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca la primera cadena:");
		String cadena = sc.nextLine();
		System.out.println("Introduzca la segunda cadena:");
		String cadena2 = sc.nextLine();
		if(cadena.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son distintas");
		}
		sc.close();
	}
	
	/**
	 * Programa que lea dos números por teclado y muestre el resultado de la división del primer número por
	 * el segundo. Se debe comprobar que el divisor no puede ser cero.
	 * @param args
	 */
	public static void ejercicio5() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el primer número:");
		double dividendo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el segundo número:");
		double divisor = sc.nextDouble();
		sc.nextLine();
		if(divisor!=0) {  // Podemos hacer la división
			System.out.println("La división da: " + (dividendo/divisor));
		} else {
			System.out.println("No se puede dividir por cero");
		}		
		sc.close();
	}
	
	/**
	 * Programa que lea una variable entera llamada mes y compruebe con una estructura switch,
	 * si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28
	 * días. Se mostrará además de los días, el nombre del mes. Se mostrará un error cuando el mes
	 * no sea válido.
	 * @param args
	 */
	public static void ejercicio9() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 días");
			break;
		case 2:
			System.out.println("El mes tiene 30 días");
			break;
		default:
			System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}
	
	public static void ejercicio9b() {  // Java 17
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch(mes) {
		case 1,3,5,7,8,10,12:
			System.out.print("El mes tiene 31 días y es ");
			if(mes==1)
				System.out.println(" Enero");
			else if(mes==3)
				System.out.println(" Marzo"); //...
			break;
		case 4,6,9,11:
			System.out.println("El mes tiene 30 días y es " + ((mes==4)?"Abril":(mes==6)?"Junio":(mes==9)?"Septiembre":"Noviembre"));
			break;
		case 2:
			System.out.println("El mes tiene 30 días y es Febrero");
			break;
		default:
			System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}
	
	public static void ejercicio9c() {  // Java 17
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch(mes) {
		case 1,3,5,7,8,10,12 -> System.out.println("El mes tiene 31 días");
		case 4,6,9,11 -> System.out.println("El mes tiene 30 días y es " + ((mes==4)?"Abril":(mes==6)?"Junio":(mes==9)?"Septiembre":"Noviembre"));
		case 2 -> System.out.println("El mes tiene 30 días y es Febrero");
		default -> System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}
	
	
	/**
	 * Crea un programa que lea una letra tecleada por el usuario y diga si se trata de un signo de
	 * puntuación (. , ; :), una cifra numérica (del 0 al 9) u otro carácter, usando "switch" (pista:
	 * necesitarás usar un dato de tipo "char").
	 */
	public static void ejercicio10() {
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0);  // guarda en cadena lo que el usuario escriba en la pantalla
		if(Character.isDigit(letra)) {  // Si es un dígito
			System.out.println("La letra es una cifra numérica");
		} else if(letra=='.' || letra==',' || letra==';' || letra==':') {
			System.out.println("La letra es un signo de puntuación");
		} else	{
			System.out.println("Es otro caracter");
		}	
		sc.close();
	}
	
	public static void ejercicio10b() { // Java 17
		Scanner sc = new Scanner (System.in);  // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:");  // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0);  // guarda en cadena lo que el usuario escriba en la pantalla
		switch(letra) {
		case '0','1','2','3','4','5','6','7','8','9' -> System.out.println("La letra es una cifra numérica");
		case '.',',',';',':' ->	System.out.println("La letra es un signo de puntuación");
		default -> System.out.println("Es otro caracter");
		}
		sc.close();
	}
	
	/**
	 * Muestra por pantalla los números de 20 al 1 usando un bucle while
	 */
	public static void ejercicio13() {
		int numero = 20;
		while(numero>0) {
			System.out.println(numero);
			numero--;  // decremento necesario para que el bucle no sea infinito.
		}
	}
	public static void ejercicio13CualquierNumero() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número a decrementar: ");
		int numero = sc.nextInt();
		while(numero>0) {
			System.out.println(numero);
			numero--;  // decremento necesario para que el bucle no sea infinito.
		}
		sc.close();
	}
	
	public static void acaboCurso() {
		LocalDate fecha = LocalDate.now();  // día de hoy (23/01/2023)
		while(fecha.isBefore(LocalDate.parse("2023-03-31"))){
			if(fecha.getDayOfWeek()!=DayOfWeek.SATURDAY && fecha.getDayOfWeek()!=DayOfWeek.SUNDAY) {
				System.out.println(fecha);
			}			
			fecha = fecha.plusDays(1);
		}
		System.out.println("Has acabado el curso");
	}

	public static void main(String[] args) {
		
		//ejercicio1();
		//ejercicio1b();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		//ejercicio9b();
		//ejercicio13();
		//ejercicio13CualquierNumero();
		acaboCurso();
	}

}
