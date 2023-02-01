package funciones;

import java.util.Arrays;

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
		
		// Ejercicio 8
		int maximo = ejercicio8(2,8,99,4,1000,9,8);
		System.out.println(maximo);  // 1000
		System.out.println(ejercicio8());  // 0
		System.out.println(ejercicio8(-2,-3,-10));  // -2
		System.out.println(ejercicio8funcional(2,8,99,4,1000,9,8));  // 1000
		System.out.println(ejercicio8funcional());  // 0
		System.out.println(ejercicio8funcional(-2,-3,-10));  // -2
	}

}
