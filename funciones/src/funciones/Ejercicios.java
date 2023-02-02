package funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

	//6. Crea una función que reciba un array de números y devuelva su media
	public static double media(double... numeros) {
		double resultado = 0;
		for(double numero : numeros) {
			resultado += numero;
		}
		return resultado/numeros.length;		
	}
	
	public static double ejercicio6(double...numeros) {
		return Arrays.stream(numeros).average().getAsDouble();
	}
	
	/**
	 * Te devuelve un elemento aleatoriamente dentro de un conjunto de elementos
	 * En este caso trabajamos con cadenas
	 * @param cadenas
	 * @return
	 */
	public static String devolverAzar(String[] cadenas) {
		return cadenas[new Random().nextInt(cadenas.length)];
	}
	
	/**
	 * Mostrar por pantalla todos los elementos dentro de un conjunto
	 * @param cadenas
	 */
	public static void mostrarElementos(String[] cadenas) {
		/*for(String cadena : cadenas) {  // Programación estructurada
			System.out.println(cadena);
		}*/
		Arrays.stream(cadenas).forEach(e->System.out.println(e));  // Programación funcional
	}
	
	/**
	 * Crea una función que reciba un array de cadenas por parámetro y devuelva una de las
	 * cadenas al azar. Pista: puedes generar un número aleatorio entre 0 y la última
	 * posición del array usando new Random().nextInt(array.length).
	 * A continuación pide al usuario que adivine la palabra seleccionada (tiene 3 intentos,
	 * usa un bucle). Si la acierta felicítale, y si no, dile cual era la correcta.
	 */
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		final int MAXIMO_INTENTOS = 3;
		boolean acierto = false;
		String[] palabras = {"hola", "adiós", "mundo", "cruel", "fran", "eoi", "java", "javascript","html", "css"};
		String palabraAleatoria = devolverAzar(palabras);
		int intentos = 0;
		do {
			System.out.println("Introduzca una palabra (le quedan " + (MAXIMO_INTENTOS-intentos) + " intento" + ((MAXIMO_INTENTOS-intentos)==1?"): ":"s): "));
			mostrarElementos(palabras);
			String palabra = sc.nextLine();
			if(palabra.equals(palabraAleatoria)) {
				acierto = true;
			}
			intentos++;
		}while(intentos<MAXIMO_INTENTOS && !acierto);
		if(acierto) {  // He salido del bucle acertando
			System.out.println("Enhorabuena!. Acertaste.");
		} else {
			System.out.println("Gastaste tus intentos. La palabra era " + palabraAleatoria);
		}
		sc.close();
	}
	
	/**
	 * Crea una función que reciba un número indeterminado de parámetros enteros y
	 * devuelva el máximo. Ten en cuenta que si recibes cero números, debes devolver cero
	 * también.
	 */
	public static int ejercicio8(int...numeros) {
		int maximo = Integer.MIN_VALUE;
		if(numeros.length==0) {
			return 0;
		}
		for(int numero : numeros) {
			if(numero>maximo) {
				maximo = numero;
			}
		}
		return maximo;
	}
	
	public static int ejercicio8funcional(int...numeros) {
		return Arrays.stream(numeros).max().orElse(0);
	}
	
	public static void main(String[] args) {
		// Ejercicio 6
		/*double[] numeros = {12.45,14.18,25.94};
		System.out.println(Arrays.stream(numeros).sum());
		double media = media(12.45,14.18,25.94);
		System.out.println(media);
		double media2 = Arrays.stream(numeros).average().getAsDouble();
		System.out.println(Arrays.stream(numeros).average().getAsDouble());
		double otraMedia = media(numeros);
		System.out.println(otraMedia);*/
		
		ejercicio7();
		
		// Ejercicio 8
		/*int maximo = ejercicio8(2,8,99,4,1000,9,8);
		System.out.println(maximo);  // 1000
		System.out.println(ejercicio8());  // 0
		System.out.println(ejercicio8(-2,-3,-10));  // -2
		System.out.println(ejercicio8funcional(2,8,99,4,1000,9,8));  // 1000
		System.out.println(ejercicio8funcional());  // 0
		System.out.println(ejercicio8funcional(-2,-3,-10));  // -2
		*/
	}

}
