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
	
	public static void main(String[] args) {
		double[] numeros = {12.45,14.18,25.94};
		System.out.println(Arrays.stream(numeros).sum());
		double media = media(12.45,14.18,25.94);
		System.out.println(media);
		double media2 = Arrays.stream(numeros).average().getAsDouble();
		System.out.println(Arrays.stream(numeros).average().getAsDouble());
		double otraMedia = media(numeros);
		System.out.println(otraMedia);
	}

}
