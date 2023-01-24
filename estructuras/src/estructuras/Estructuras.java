package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static final double IVA = 0.23;

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

	public static void ejemploTernarias() {
		int edad = 40;

		/*
		 * if(edad>=18) System.out.println("Eres mayor de edad"); else
		 * System.out.println("Eres menor de edad");
		 */

		System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");

		/*
		 * int descuento; if(edad>=18) { descuento=5; } else { descuento=20; }
		 */

		int descuento = edad >= 18 ? 5 : 20;
		System.out.println(descuento);

		/*
		 * int tresValores; if(edad<18) { tresValores=1; } else if(edad>=18 && edad<=65)
		 * { tresValores=2; } else { tresValores=3; }
		 */

		int tresValores = edad < 18 ? 1 : (edad >= 18 && edad <= 65) ? 2 : 3;

		System.out.println("TresValores vale " + tresValores);

		int euros = 10;
		if (euros > 1) {
			System.out.println("Cuesta " + euros + " euros");
		} else {
			System.out.println("Cuesta " + euros + " euro");
		}

		System.out.println("Cuesta " + euros + " euro" + (euros != 1 ? "s" : ""));
		System.out.println("Cuesta " + euros + (euros != 1 ? "euros" : "euro"));

	}

	public static void ejemploAmbitosVariables() {
		int numero = 5;
		int edad = 20;

		if (edad > 18) {
			// int numero=3; // En Java da error
			int valor = 4;
			System.out.println(numero);
		}
		System.out.println("hola");
		// System.out.println(valor); // Da error porque la variable no existe fuera del
		// if
	}

	/**
	 * Este programa se ejecuta hasta que el usuario adivine la contraseña
	 */
	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		String password = "1234";
		boolean adivina = false;
		while (!adivina) { // (adivina==false)
			System.out.println("Introduzca la contraseña:");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste.\nSigue intentándolo");
			}
		}
		System.out.println("Enhorabuena! acertaste.");
		sc.close();
	}

	/**
	 * El programa permite adivinar la password en 3 oportunidades
	 */
	public static void ejemploWhile2() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		while (!adivina && intentos < 3) { // (adivina==false)
			System.out.println("Introduzca la contraseña (Tienes " + (3 - intentos) + " intento"
					+ (intentos != 2 ? "s" : "") + "):");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
			intentos++;
		}
		System.out.println(adivina ? "Acertaste" : "Gastaste todas tus intentos");
		/*
		 * if(adivina) { // (adivina==true) System.out.println("Acertaste"); } else {
		 * System.out.println("Gastaste todas tus intentos"); }
		 */
		sc.close();
	}

	/**
	 * El programa permite adivinar la password en 3 oportunidades
	 */
	public static void ejemploDoWhile1() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		do {
			System.out.println("Introduzca la contraseña (Tienes " + (3 - intentos) + " intento"
					+ (intentos != 2 ? "s" : "") + "):");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
			intentos++;
		} while (!adivina && intentos < 3);
		System.out.println(adivina ? "Acertaste" : "Gastaste todas tus intentos");
		/*
		 * if(adivina) { // (adivina==true) System.out.println("Acertaste"); } else {
		 * System.out.println("Gastaste todas tus intentos"); }
		 */
		sc.close();
	}

	public static void ejemploDoWhile2() {

		Scanner sc = new Scanner(System.in);
		int opcion = -1; // Le damos un valor que no aparezca en el menú
		do {
			// Impresión de menú
			System.out.println("1. Primera opción");
			System.out.println("2. Segunda opción");
			System.out.println("3. Tercera opción");
			System.out.println("4. Cuarta opción");
			System.out.println("0. Salir");
			System.out.println("Seleccione opción:");
			// Obtención de la opción
			opcion = sc.nextInt();
			sc.nextLine();
			// Tratamiento de la opción
			switch (opcion) {
			case 1 -> System.out.println("Has elegido la primera opción");
			case 2 -> System.out.println("Has elegido la segunda opción");
			case 3 -> System.out.println("Has elegido la tercera opción");
			case 4 -> System.out.println("Has elegido la cuarta opción");
			case 0 -> System.out.println("¡Gracias por usar nuestro programa!");
			default -> System.out.println("La opción seleccionada no es correcta");
			}
		} while (opcion != 0);
		sc.close();
	}

	public static void offTopicBloqueTexto() {
		// Java 11
		String texto = "Primera línea\n" + "Segunda línea\n" + "\t\tTercera línea";
		System.out.println(texto);
		// Java 17
		String texto2 = """
				Lorem ipsum dolor sit amet, consectetur adipiscing \
				elit, sed do eiusmod tempor incididunt ut labore
				et dolore magna aliqua.\
				""";
		System.out.println(texto2);
	}

	public static void ejemploFor1() {
		for (int i = 0; i < 10; i++) { // For estándar
			System.out.println("Repetición número " + (i));
		}
	}

	public static void ejemploFor1b() {
		int i = 0;
		for (; i < 10;) {
			System.out.println("Repetición número " + (i));
			i++;
		}
	}

	public static void ejemploForaWhile() {
		int i = 0;
		while (i < 10) {
			System.out.println("Repetición número " + (i));
			i++;
		}
	}

	public static void ejemploFor1c() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("Repetición número " + (i));
		}
	}

	public static void ejemploFor1d() {
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Repetición número " + (i));
		}
	}

	public static void ejemploFor1e() {
		for (int i = 0; i < 10; i += 1) {
			System.out.println("Repetición número " + (i));
		}
	}

	public static void ejemploFor2() { // Bucle infinito
		for (;;) {
			System.out.println("Repetición número ");
		}
	}

	public static void ejemploFor3() { // For hacia atrás
		for (int i = 10; i > 0; i--) {
			System.out.println("Repetición número " + i);
		}
	}

	public static void ejemploFor4() { // For con salto de más de 1

		for (int i = 0; i < 1000; i = i + 2) {
			System.out.println("Valor de i= " + i);
		}

	}

	public static void ejemploBreak() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca la contraseña:");
			String password = sc.nextLine();
			if (password.contains("kk")) {
				break; // Si encuentra una palabra con kk ya no ejecuta más el bucle
			}
			System.out.println("Gracias por introducir su contraseña.");
		}
		sc.close();
	}

	public static void ejemploContinue() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca la contraseña:");
			String password = sc.nextLine();
			if (password.contains("kk")) {
				continue; // Si encuentra una palabra con kk siempre ejecuta todo el bucle, pero no lo que
							// queda detrás del continue en esa iteración
			}
			// No se ejecuta si se ha ejecutado el continue
			System.out.println("Gracias por introducir su contraseña.");
		}
		sc.close();
	}

	/**
	 * Vemos las tablas del 1 al 5 con sus 10 números
	 */
	public static void ejemploForAnidadosTablasMultiplicar() {
		for (int tabla = 1; tabla <= 5; tabla++) {
			for (int num = 1; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + (tabla * num));
			}
		}
	}
	
	/**
	 * Vemos las tablas del 1 al 5 con sus 10 números, pero además con una cabecera por cada tabla
	 */
	public static void ejemploForAnidadosTablasMultiplicarB() {
		for (int tabla = 1; tabla <= 5; tabla++) {
			System.out.println("Comienzo de la tabla del " + tabla);
			for (int num = 1; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + (tabla * num));
			}
		}
	}
	
	/**
	 * Vemos las tablas del 1 al 5 con sus 10 números, pero además con una cabecera y un fin por cada tabla
	 */
	public static void ejemploForAnidadosTablasMultiplicarC() {
		for (int tabla = 1; tabla <= 5; tabla++) {
			System.out.println("Comienzo de la tabla del " + tabla);
			for (int num = 1; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + (tabla * num));
			}
			System.out.println("Fin de la tabla del " + tabla);
		}
	}

	public static void main(String[] args) {
		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// IfElseIfSinElse();
		// ejemploSwitch();
		// ejemploTernarias();
		// ejemploAmbitosVariables();
		// ejemploWhile1();
		// ejemploWhile2();
		// ejemploDoWhile1();
		// ejemploDoWhile2();
		// offTopicBloqueTexto();
		// ejemploFor1();
		// ejemploFor1c();
		// ejemploFor2();
		// ejemploFor3();
		// ejemploFor4();
		// ejemploContinue();
		// ejemploForAnidadosTablasMultiplicar();
		// ejemploForAnidadosTablasMultiplicarB();
		ejemploForAnidadosTablasMultiplicarC();
	}

}
