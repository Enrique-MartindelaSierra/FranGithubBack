package ejerciciosEstructuras;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicios {

	public static void ejercicio1() {
		int numero = 123456;
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}

	/**
	 * Programa que lea un número entero y muestre si el número es múltiplo de 10
	 * (si el resto de la división entre 10 da 0).
	 * 
	 * @param args
	 */
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int numero = sc.nextInt();
		if (numero % 10 == 0) {
			System.out.println("El número es múltiplo de 10");
		} else {
			System.out.println("El número no es múltiplo de 10");
		}
		sc.close();
	}

	/**
	 * Programa que lea un carácter por teclado y compruebe si es una letra
	 * mayúscula. Una letra mayúscula es aquella que está entre la ‘A’ y la ‘Z’.
	 * Recuerda que se pueden comparar los caracteres como si fueran números.
	 * Utiliza cadena.charAt(0) para acceder al primer carácter recibido.
	 * 
	 * @param args
	 */
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:"); // Petición al usuario que escriba
		String cadena = sc.nextLine(); // guarda en cadena lo que el usuario escriba en la pantalla
		if (cadena.charAt(0) >= 'A' && cadena.charAt(0) <= 'Z') { // cadena.charAt(0) es la primera letra
			System.out.println("La primera letra es una mayúscula");
		} else {
			System.out.println("La primera letra NO es una mayúscula");
		}
		sc.close();
	}

	public static void ejercicio3b() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:"); // Petición al usuario que escriba
		String cadena = sc.nextLine(); // guarda en cadena lo que el usuario escriba en la pantalla
		char letra = cadena.charAt(0); // coger la primera letra de una cadena y asignarsela a un char
		if (letra >= 'A' && letra <= 'Z') { // cadena.charAt(0) es la primera letra
			System.out.println("La primera letra es una mayúscula");
		} else {
			System.out.println("La primera letra NO es una mayúscula");
		}
		sc.close();
	}

	public static void ejercicio3c() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:"); // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0); // guarda en cadena lo que el usuario escriba en la pantalla
		if (letra >= 'A' && letra <= 'Z') { // cadena.charAt(0) es la primera letra
			System.out.println("La primera letra es una mayúscula");
		} else {
			System.out.println("La primera letra NO es una mayúscula");
		}
		sc.close();
	}

	/**
	 * Programa que le pida 2 cadenas de texto al usuario y compruebe si son
	 * iguales.
	 * 
	 * @param args
	 */
	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		System.out.println("Introduzca la primera cadena:");
		String cadena = sc.nextLine();
		System.out.println("Introduzca la segunda cadena:");
		String cadena2 = sc.nextLine();
		if (cadena.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son distintas");
		}
		sc.close();
	}

	/**
	 * Programa que lea dos números por teclado y muestre el resultado de la
	 * división del primer número por el segundo. Se debe comprobar que el divisor
	 * no puede ser cero.
	 * 
	 * @param args
	 */
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número:");
		double dividendo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el segundo número:");
		double divisor = sc.nextDouble();
		sc.nextLine();
		if (divisor != 0) { // Podemos hacer la división
			System.out.println("La división da: " + (dividendo / divisor));
		} else {
			System.out.println("No se puede dividir por cero");
		}
		sc.close();
	}

	/**
	 * Programa que pida al usuario una cantidad de horas, de minutos y de segundos
	 * (3 números diferentes). Comprueba que la hora está en el rango de 0 a 23, los
	 * minutos y los segundos de 0 a 59. Si todo es correcto, muestra al usuario la
	 * hora en formato HH:MM:SS (2 cifras para cada parte rellenando con 0 a la
	 * izquierda si es una cifra), y si no, muestra un mensaje de error. Pista:
	 * Repasa la parte de formatear la salida de texto para números enteros.
	 */
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las horas (0-23):");
		int horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca los minutos (0-59):");
		int minutos = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca los segundos (0-59):");
		int segundos = Integer.parseInt(sc.nextLine());
		if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
			System.out.println("Ha introducido valores erróneos");
		} else {
			System.out.printf("Hora: %02d:%02d:%02d\n", horas, minutos, segundos);
		}
		sc.close();
	}

	public static void ejercicio7bErroresPersonalizados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las horas (0-23):");
		int horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca los minutos (0-59):");
		int minutos = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca los segundos (0-59):");
		int segundos = Integer.parseInt(sc.nextLine());
		if (horas < 0 || horas > 23) {
			System.out.println("Ha introducido una hora errónea");
		} else if (minutos < 0 || minutos > 59) {
			System.out.println("Ha introducido los minutos erróneos");
		} else if (segundos < 0 || segundos > 59) {
			System.out.println("Ha introducido los segundos erróneos");
		} else {
			System.out.printf("Hora: %02d:%02d:%02d\n", horas, minutos, segundos);
		}
		sc.close();
	}

	public static void ejercicio7bErroresMultiplesPersonalizados() {
		boolean error = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las horas (0-23):");
		int horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca los minutos (0-59):");
		int minutos = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca los segundos (0-59):");
		int segundos = Integer.parseInt(sc.nextLine());
		if (horas < 0 || horas > 23) {
			System.out.println("Ha introducido una hora errónea");
			error = true;
		}
		if (minutos < 0 || minutos > 59) {
			System.out.println("Ha introducido los minutos erróneos");
			error = true;
		}
		if (segundos < 0 || segundos > 59) {
			System.out.println("Ha introducido los segundos erróneos");
			error = true;
		}
		if (!error) {
			System.out.printf("Hora: %02d:%02d:%02d\n", horas, minutos, segundos);
		}
		sc.close();
	}

	public static void ejercicio8() {
		int A = 123456;
		System.out.println((A % 2 == 0) ? "El número es par" : "El número es impar");
	}

	/**
	 * Programa que lea una variable entera llamada mes y compruebe con una
	 * estructura switch, si el valor corresponde a un mes de 30 días, de 31 o de
	 * 28. Supondremos que febrero tiene 28 días. Se mostrará además de los días, el
	 * nombre del mes. Se mostrará un error cuando el mes no sea válido.
	 * 
	 * @param args
	 */
	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch (mes) {
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

	public static void ejercicio9b() { // Java 17
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.print("El mes tiene 31 días y es ");
			if (mes == 1)
				System.out.println(" Enero");
			else if (mes == 3)
				System.out.println(" Marzo"); // ...
			break;
		case 4, 6, 9, 11:
			System.out.println("El mes tiene 30 días y es "
					+ ((mes == 4) ? "Abril" : (mes == 6) ? "Junio" : (mes == 9) ? "Septiembre" : "Noviembre"));
			break;
		case 2:
			System.out.println("El mes tiene 30 días y es Febrero");
			break;
		default:
			System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}

	public static void ejercicio9c() { // Java 17
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número del mes:");
		int mes = sc.nextInt();
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El mes tiene 31 días");
		case 4, 6, 9, 11 -> System.out.println("El mes tiene 30 días y es "
				+ ((mes == 4) ? "Abril" : (mes == 6) ? "Junio" : (mes == 9) ? "Septiembre" : "Noviembre"));
		case 2 -> System.out.println("El mes tiene 30 días y es Febrero");
		default -> System.out.println("El número de mes introducido no es correcto");
		}
		sc.close();
	}

	/**
	 * Crea un programa que lea una letra tecleada por el usuario y diga si se trata
	 * de un signo de puntuación (. , ; :), una cifra numérica (del 0 al 9) u otro
	 * carácter, usando "switch" (pista: necesitarás usar un dato de tipo "char").
	 */
	public static void ejercicio10() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:"); // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0); // guarda en cadena lo que el usuario escriba en la pantalla
		if (Character.isDigit(letra)) { // Si es un dígito
			System.out.println("La letra es una cifra numérica");
		} else if (letra == '.' || letra == ',' || letra == ';' || letra == ':') {
			System.out.println("La letra es un signo de puntuación");
		} else {
			System.out.println("Es otro caracter");
		}
		sc.close();
	}

	public static void ejercicio10b() { // Java 17
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		System.out.println("Introduzca una letra por teclado:"); // Petición al usuario que escriba
		char letra = sc.nextLine().charAt(0); // guarda en cadena lo que el usuario escriba en la pantalla
		switch (letra) {
		case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("La letra es una cifra numérica");
		case '.', ',', ';', ':' -> System.out.println("La letra es un signo de puntuación");
		default -> System.out.println("Es otro caracter");
		}
		sc.close();
	}

	/**
	 * 12. Crea una variable con el precio de una entrada que inicialmente valga 50.
	 * Pregunta al usuario su edad. a. Si es menor de edad se le hará un descuento
	 * del 25% en la entrada. b. Si es mayor de edad pero no está jubilado (65
	 * años), pregúntale si es socio. Si el usuario responde “sí” hazle un descuento
	 * del 40%. c. Si está jubilado se le hará un descuento del 75%. d. Finalmente
	 * muéstrale el precio que tiene que pagar por la entrada
	 */

	public static void ejercicio12() {
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		double precioEntrada = 50;
		System.out.println("Introduzca su edad:");
		int edad = sc.nextInt();
		sc.nextLine();
		if (edad < 18) {
			precioEntrada = precioEntrada * (1 - MENOR_EDAD); // precio * 0,75
		} else if (edad >= 18 && edad < 65) {
			System.out.println("Es usted socio (sí/no):");
			String respuesta = sc.nextLine();
			// Solución con expresión regular
			/*
			 * Pattern regex = Pattern.compile("^s[iíÍ]?$", Pattern.CASE_INSENSITIVE);
			 * Matcher m = regex.matcher(respuesta); if(m.matches()) { precioEntrada =
			 * precioEntrada * (1 - DESCUENTO_SOCIO);
			 */
			// Solución sin expresión regular
			if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")
					|| respuesta.equalsIgnoreCase("s")) {
				precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
			}
		} else {
			precioEntrada = precioEntrada * (1 - DESCUENTO_JUBILADO);
		}
		System.out.println("Su precio es: " + precioEntrada);
		sc.close();
	}

	/**
	 * Mismo ejercicio para un grupo de personas
	 */
	public static void ejercicio12Grupo() {
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		final int PRECIO_ENTRADA = 50;
		final int MAYORIA_EDAD = 18;
		final int EDAD_JUBILACION = 65;
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		double precioEntrada = PRECIO_ENTRADA; // Precio estándar sin descuentos
		double precioTotalGrupo = 0; // Almacenará el precio total
		System.out.println("¿Cuántos sois?");
		int personas = sc.nextInt(); // Ya tengo las personas
		sc.nextLine();
		int personasAtendidas = 0;
		while (personasAtendidas < personas) {
			System.out.println("Datos de la persona " + (personasAtendidas + 1));
			System.out.println("Introduzca su edad:");
			int edad = sc.nextInt();
			sc.nextLine();
			precioEntrada = PRECIO_ENTRADA; // Volver a poner el precio que toca para ver si se aplican descuentos
			if (edad < MAYORIA_EDAD) {
				precioEntrada = precioEntrada * (1 - MENOR_EDAD);
			} else if (edad >= MAYORIA_EDAD && edad < EDAD_JUBILACION) {
				System.out.println("Es usted socio (sí/no):");
				String respuesta = sc.nextLine();
				if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")
						|| respuesta.equalsIgnoreCase("s")) {
					precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
				}
			} else {
				precioEntrada = precioEntrada * (1 - DESCUENTO_JUBILADO);
			}
			precioTotalGrupo += precioEntrada;
			System.out
					.println("Precio de la entrada de la persona " + (personasAtendidas + 1) + " es " + precioEntrada);
			System.out.println("Precio del grupo hasta el momento: " + precioTotalGrupo);
			personasAtendidas++;
		}

		System.out.println("El precio FINAL del grupo es: " + precioTotalGrupo);
		sc.close();
	}

	/**
	 * Muestra por pantalla los números de 20 al 1 usando un bucle while
	 */
	public static void ejercicio13() {
		int numero = 20;
		while (numero > 0) {
			System.out.println(numero);
			numero--; // decremento necesario para que el bucle no sea infinito.
		}
	}

	public static void ejercicio13CualquierNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número a decrementar: ");
		int numero = sc.nextInt();
		while (numero > 0) {
			System.out.println(numero);
			numero--; // decremento necesario para que el bucle no sea infinito.
		}
		sc.close();
	}

	public static void acaboCurso() {
		int diasQuedan = 0;
		LocalDate fecha = LocalDate.now(); // día de hoy (23/01/2023)
		while (fecha.isBefore(LocalDate.parse("2023-03-31"))) {
			if (fecha.getDayOfWeek() != DayOfWeek.SATURDAY && fecha.getDayOfWeek() != DayOfWeek.SUNDAY) {
				System.out.println(fecha);
				diasQuedan++;
			}
			fecha = fecha.plusDays(1); // fecha = fecha + 1 dia;
		}
		System.out.println("Te quedan " + diasQuedan + " días");
	}

	public static void imprimirHoraFecha() {
		// Java 8
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime fechaHora = LocalDateTime.now();
		System.out.println(fecha);
		System.out.println(hora);
		System.out.println(fechaHora);
		// Java 5
		Date fechaJava5 = new Date(); // huid
	}

	/**
	 * Pide al usuario un número y dile los divisores de dicho número (resto da
	 * cero).
	 */
	public static void ejercicio21() { // Resuelto con For
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable
		for (int i = 1; i <= numero; i++) { // 1,2,3,4,5,6,7...,18,19,20
			if (numero % i == 0) {
				System.out.println("El número " + i + " es divisor de " + numero);
			}
		}
		sc.close();
	}

	public static void ejercicio21b() { // Resuelto con While
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		sc.nextLine();
		int i = 1;
		while (i < numero) {
			if (numero % i == 0) {
				System.out.println("El número " + i + " es divisor de " + numero);
			}
			i++;
		}
		sc.close();
	}

	/**
	 * Decir si un número es primo o no Primo es si solamente es divisible por 1 y
	 * por él mismo (ej: 2,3,5,7,11,13,17...)
	 */
	public static void ejercicio21Primos() { // Resuelto con For
		int vecesFor = 0;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable
		for (int i = 1; i <= numero; i++) {
			vecesFor++;
			if (numero % i == 0) {
				contador++;
			}
		}
		System.out.println("El bucle for se ejecuta: " + vecesFor);
		if (contador == 2 || numero == 1) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}

	public static void ejercicio21PrimosConBooleano() {
		int contador = 0;// Resuelto con For
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable
		for (int i = 2; i < numero / 2 && esPrimo; i++) {
			contador++;
			if (numero % i == 0) {
				esPrimo = false;
			}
		}
		System.out.println("El bucle for se ejecuta: " + contador);
		if (esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}

	public static void ejercicio21PrimosConBreak() {
		int contador = 0;// Resuelto con For
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable
		for (int i = 2; i < numero / 2; i++) {
			contador++;
			if (numero % i == 0) {
				esPrimo = false;
				break; // No recomendable salvo excepciones
			}
		}
		System.out.println("El bucle for se ejecuta: " + contador);
		if (esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}

	public static void ejemploForComplejo() {
		for (int i = 0, j = 10; i <= 10 && j > 5; i++, j--) { // 0+10, 1+9, 2+8, 3+7, 4+6
			System.out.println(i + " + " + j + " = " + (i + j));
		}
	}

	/**
	 * Muestra de 5 en 5, los números del 0 al 100.
	 */
	public static void ejercicio18() {
		for (int i = 0; i <= 100; i++) { // Voy del 0 al 100
			if (i % 5 == 0) { // compruebo que sea múltiplo de 5
				System.out.println(i);
			}
		}
	}

	public static void ejercicio18B() {
		for (int i = 0; i <= 100; i += 5) { // i = i + 5 => i+=5
			System.out.println(i);
		}
	}

	public static void ejercicio18C() { // While
		int i = 0;
		while (i <= 100) {
			System.out.println(i);
			i += 5;
		}
	}

	/**
	 * Pregunta al usuario un número y muestra del 1 hasta ese número, en una misma
	 * línea, separados por comas (debes comprobar cuando es el último y no poner
	 * una coma en ese caso). 
	 * Dime un número: 7 
	 * 1,2,3,4,5,6,7
	 */
	public static void ejercicio19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int numero = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + ((i != numero) ? "," : ""));
		}
		sc.close();
	}
	
	public static void ejercicio19B() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int numero = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= numero; i++) {
			if(i!=numero) {  // Si no es el último
				System.out.print(i+",");
			} else {  // Si es el último
				System.out.print(i);
			}			
		}
		sc.close();
	}

	public static void main(String[] args) {

		// ejercicio1();
		// ejercicio1b();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio7();
		// ejercicio7bErroresPersonalizados();
		// ejercicio8();
		// ejercicio9b();
		// ejercicio12();
		// ejercicio12Grupo();
		// ejercicio13();
		// ejercicio13CualquierNumero();
		// acaboCurso();
		// imprimirHoraFecha();
		// ejercicio21();
		// ejercicio21b();
		// ejercicio21Primos();
		// ejercicio21PrimosConBooleano();
		// ejemploForComplejo();
		// ejercicio18();
		// ejercicio18B();
		ejercicio19();
	}

}
