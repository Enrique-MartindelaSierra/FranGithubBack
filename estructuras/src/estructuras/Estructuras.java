package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();

		if (nombre.equals("Fran")) {
			System.out.println("Hola Fran");
		}
		System.out.println("Pasa un buen día!");
		sc.close();
	}

	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();

		if (nombre.equals("Fran")) {
			System.out.println("Hola Fran");
			System.out.println("Encantado de verte de nuevo");
		} else {
			System.out.println("Hola persona desconocida");
			System.out.println("Espero verte habitualmento por aquí");
		}
		System.out.println("Pasa un buen día!");
		sc.close();
	}

	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido:");
		int numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("Ha salido un uno");
		} else if (numero == 2) {
			System.out.println("Ha salido un dos");
		} else if (numero == 3) {
			System.out.println("Ha salido un tres");
		} else if (numero == 4) {
			System.out.println("Ha salido un cuatro");
		} else if (numero == 5) {
			System.out.println("Ha salido un cinco");
		} else if (numero == 6) {
			System.out.println("Ha salido un seis");
		} else {
			System.out.println("¿Qué tipo de dato tienes que puede salir diferente 1-6?");
		}
		System.out.println("hola");
		sc.close();
	}

	public static void IfElseIfSinElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu equipo preferido");
		String equipo = sc.nextLine();
		String equipoMayusculas = equipo.toUpperCase(); // pasa la cadena a mayúscula y le asigna el valor a otra nueva
														// variable

		if (equipo.toLowerCase().equals("barcelona")) { // Pasa a minúscula y compara
			System.out.println("Visca el Barsa!");
		} else if (equipo.toUpperCase().equals("MADRID")) { // Pasa a mayúscula y compara
			System.out.println("Hala Madrid!");
		} else if (equipo.equalsIgnoreCase("atletico")) { // Compara sin tener en cuenta mayúsculas ni minúsculas
			System.out.println("Aupa Atleti!");
		}
		System.out.println("Bienvenido a nuestro programa de fútbol");
		sc.close();
	}

	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido:");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Ha salido un uno");
			break;
		case 2:
			System.out.println("Ha salido un dos");
			break;
		case 3:
			System.out.println("Ha salido un tres");
			break;
		case 4:
			System.out.println("Ha salido un cuatro");
			break;
		case 5:
			System.out.println("Ha salido un cinco");
			break;
		case 6:
			System.out.println("Ha salido un seis");
			break;
		default:
			System.out.println("¿Qué tipo de dato tienes que puede salir diferente 1-6?");
			break;
		}

		sc.close();
	}

	public static void main(String[] args) {
		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// IfElseIfSinElse();
		ejemploSwitch();
	}

}
